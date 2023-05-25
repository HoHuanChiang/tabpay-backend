package com.example.tabapay.api.model;

import com.example.tabapay.api.entity.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LocationModel {
    private Long id;

    private String name;

    private String address;

    private String description;

    private String website;

    private List<String> imageUrls = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public static LocationModel ToModel(Location location){
        LocationModel locationModel = new LocationModel();
        locationModel.setId(location.getId());
        locationModel.setName(location.getName());
        locationModel.setAddress(location.getAddress());
        locationModel.setDescription(location.getDescription());
        locationModel.setWebsite(location.getWebsite());
        return locationModel;
    }

    public static LocationModel ToModel(Location location, Map<Long, List<String>> locationImageMap){
        LocationModel locationModel = new LocationModel();
        locationModel.setId(location.getId());
        locationModel.setName(location.getName());
        locationModel.setAddress(location.getAddress());
        locationModel.setDescription(location.getDescription());
        locationModel.setWebsite(location.getWebsite());
        if (locationImageMap.containsKey(location.getId())){
            locationModel.setImageUrls(locationImageMap.get(location.getId()));
        }
        return locationModel;
    }
}
