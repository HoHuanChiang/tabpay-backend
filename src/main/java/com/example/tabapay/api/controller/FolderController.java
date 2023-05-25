package com.example.tabapay.api.controller;

import com.example.tabapay.api.model.FolderModel;
import com.example.tabapay.service.FolderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/folder")
public class FolderController {
    private FolderService _folderService;

    public FolderController(FolderService folderService){
        _folderService = folderService;
    }

    @GetMapping("/root")
    public FolderModel GetRootFolder(){
        return _folderService.GetRootFolder();
    }
}
