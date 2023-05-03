package com.satinfo.demo.controller;

import com.satinfo.demo.entity.Satellites;
import com.satinfo.demo.service.SatelliteServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/satellites")
public class MainController {
    private SatelliteServiceImplementations satelliteService;

    @Autowired
    public MainController(SatelliteServiceImplementations satelliteService) {
        this.satelliteService = satelliteService;
    }

    @GetMapping
    public List<Satellites> getAllSatellites(){
        return satelliteService.getAllSatellites();
    }

    @GetMapping("/{satelliteID}")
    public Optional<Satellites> getSatelliteById(@PathVariable("satelliteID") int id){
        return satelliteService.getSatelliteById(id);
    }
}
