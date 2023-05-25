package com.example.tabapay.api.model;

import com.example.tabapay.api.entity.Destination;

import java.util.List;
import java.util.Map;

public class DestinationModel {
    private Long id;

    private String name;

    private List<LocationModel> locations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name; }

    public List<LocationModel> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationModel> locations) {
        this.locations = locations;
    }

    public static DestinationModel ToModel(Destination destination){
        var destinationModel = new DestinationModel();
        destinationModel.setId(destination.getId());
        destinationModel.setName(destination.getName());
        destinationModel.setLocations(destination.getLocations().stream().map(location->LocationModel.ToModel((location))).toList());
        return destinationModel;
    }

    public static DestinationModel ToModel(Destination destination, Map<Long, List<String>> locationImageMap){
        var destinationModel = new DestinationModel();
        destinationModel.setId(destination.getId());
        destinationModel.setName(destination.getName());
        destinationModel.setLocations(destination.getLocations().stream().map(location->LocationModel.ToModel((location), locationImageMap)).toList());
        return destinationModel;
    }
}
