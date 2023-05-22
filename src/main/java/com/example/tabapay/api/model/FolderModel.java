package com.example.tabapay.api.model;

import com.example.tabapay.api.entity.Folder;

import java.util.List;

public class FolderModel {
    private Long id;

    private String name;

    private List<FolderModel> subFolders;

    private List<DestinationModel> destinations;

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

    public List<FolderModel> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(List<FolderModel> subFolders) {
        this.subFolders = subFolders;
    }

    public List<DestinationModel> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<DestinationModel> destinations) {
        this.destinations = destinations;
    }

    public static FolderModel ToModel(Folder folder){
        var folderModel = new FolderModel();
        folderModel.setId(folder.getId());
        folderModel.setName(folder.getName());
        folderModel.setSubFolders(folder.getSubFolder().stream().map(subFolder->FolderModel.ToModel(subFolder)).toList());
        folderModel.setDestinations(folder.getDestinations().stream().map(destination-> DestinationModel.ToModel(destination)).toList());
        return folderModel;
    }
}
