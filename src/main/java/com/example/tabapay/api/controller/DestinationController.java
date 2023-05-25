package com.example.tabapay.api.controller;

import com.example.tabapay.api.model.DestinationModel;
import com.example.tabapay.service.DestinationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destination")
public class DestinationController {

    private DestinationService _destinationService;

    public DestinationController(DestinationService destinationService){
        _destinationService = destinationService;
    }

    @GetMapping("/{destinationId}")
    public DestinationModel GetDestinationDetails(@PathVariable("destinationId") Long destinationId){
        return _destinationService.GetDestinationDetails(destinationId);
    }
}
