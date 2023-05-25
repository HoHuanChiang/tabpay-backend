package com.example.tabapay.service;

import com.example.tabapay.api.model.FolderModel;
import com.example.tabapay.api.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FolderService {

    @Autowired
    private FolderRepository _folderRepository;
    public FolderService(){

    }

    public FolderModel GetRootFolder(){
        var folders = _folderRepository.findByParentFolderId(null);
        if (!folders.isEmpty()){
            return FolderModel.ToModel(folders.get(0));
        }
        return null;
    }


}
