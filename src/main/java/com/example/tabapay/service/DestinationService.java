package com.example.tabapay.service;

import com.example.tabapay.api.enums.ObjectType;
import com.example.tabapay.api.model.DestinationModel;
import com.example.tabapay.api.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository _destinationRepository;

    private ImageService _imageService;
    public DestinationService(ImageService imageService){
        _imageService = imageService;
    }

    public DestinationModel GetDestinationDetails(Long id){
        var destination = _destinationRepository.findById(id);
        if (destination.isPresent()){
            var locationIds = destination.get().getLocations().stream().map(x->x.getId()).toList();
            var locationImageMap = _imageService.GetObjectIdAndURLsMap(ObjectType.Location, locationIds);
            return DestinationModel.ToModel(destination.get(), locationImageMap);
        }
        return null;
    }
}
