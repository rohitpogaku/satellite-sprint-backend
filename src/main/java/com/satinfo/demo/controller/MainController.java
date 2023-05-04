package com.satinfo.demo.controller;

import com.satinfo.demo.entity.SatelliteDataWithJoin;
import com.satinfo.demo.entity.Satellites;
import com.satinfo.demo.service.SatelliteServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/satellites")
public class MainController {
    private final SatelliteServiceImplementations satelliteService;

    @Autowired
    public MainController(SatelliteServiceImplementations satelliteService) {
        this.satelliteService = satelliteService;
    }

    @GetMapping
    public List<SatelliteDataWithJoin> getAllSatellites() {
        return satelliteService.getAllSatellites();
    }

    @GetMapping("/{satelliteID}")
    public Optional<Satellites> getSatelliteById(@PathVariable("satelliteID") int id) {
        return satelliteService.getSatelliteById(id);
    }

    @GetMapping("/agency/{agencyID}")
    public Satellites getSatelliteByAgencyID(@PathVariable("agencyID") int id) {
        return satelliteService.getSatelliteByAgencyId(id);
    }

    @PostMapping
    public void insertSatellite(@RequestBody Satellites satellite) {
        satelliteService.insertSatelliteIntoDatabse(satellite);
    }

}
