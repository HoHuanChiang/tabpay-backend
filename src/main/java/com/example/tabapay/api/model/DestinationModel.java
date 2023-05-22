package com.example.tabapay.api.model;

import com.example.tabapay.api.entity.Destination;

public class DestinationModel {
    private Long Id;

    private String Name;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static DestinationModel ToModel(Destination destination){
        var destinationModel = new DestinationModel();
        destinationModel.setId(destination.getId());
        destinationModel.setName(destination.getName());
        return destinationModel;
    }
}
