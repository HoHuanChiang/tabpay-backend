package com.example.tabapay.service;

import com.example.tabapay.api.enums.ObjectType;
import com.example.tabapay.api.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ImageService {
    @Autowired
    private ImageRepository _imageRepository;
    public ImageService(){

    }

    public Map<Long, List<String>> GetObjectIdAndURLsMap(ObjectType objectType, List<Long> objectTypeIds){
        var images = _imageRepository.findByObjectTypeAndObjectTypeIdIn(objectType, objectTypeIds);
        Map<Long, List<String>> objectImageMap = new HashMap<>();
        for (int i=0;i<images.size();i++){
            var objectId = images.get(i).getObjectTypeId();
            if (objectImageMap.containsKey(objectId)){
                objectImageMap.get(objectId).add(images.get(i).getImageName());
            }
            else{
                List<String> imageUrls = new ArrayList<>();
                imageUrls.add(images.get(i).getImageName());
                objectImageMap.put(objectId, imageUrls);
            }
        }
        return objectImageMap;
    }
}
