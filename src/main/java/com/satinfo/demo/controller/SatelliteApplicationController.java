package com.satinfo.demo.controller;

import com.satinfo.demo.entity.SatelliteApplication;
import com.satinfo.demo.service.SatelliteApplicationServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/applications")
public class SatelliteApplicationController {
    private final SatelliteApplicationServiceImplementations satelliteApplicationServiceImplementations;

    @Autowired
    public SatelliteApplicationController(SatelliteApplicationServiceImplementations satelliteApplicationServiceImplementations) {
        this.satelliteApplicationServiceImplementations = satelliteApplicationServiceImplementations;
    }

    @GetMapping
    public List<SatelliteApplication> getAllSatelliteApplications() {
        return satelliteApplicationServiceImplementations.getAllSatelliteApplications();
    }

    @GetMapping("/{applicationId}")
    public SatelliteApplication getSatelliteApplicationById(@PathVariable("applicationId") int id) {
        return satelliteApplicationServiceImplementations.getSatelliteApplicationById(id);
    }

    @GetMapping("/name")
    public int getSatelliteApplicationIdByName(@RequestParam(required = false) String name) {
        return satelliteApplicationServiceImplementations.getSatelliteIdByName(name);
    }
}
