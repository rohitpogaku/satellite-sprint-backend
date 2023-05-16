package com.satinfo.demo.controller;

import com.satinfo.demo.entity.OrbitType;
import com.satinfo.demo.service.OrbitTypeServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orbits")
public class OrbitTypeController {
    private final OrbitTypeServiceImplementations orbitTypeServiceImplementations;

    @Autowired
    public OrbitTypeController(OrbitTypeServiceImplementations orbitTypeServiceImplementations) {
        this.orbitTypeServiceImplementations = orbitTypeServiceImplementations;
    }

    @GetMapping
    public List<OrbitType> getAllOrbitTypes() {
        return orbitTypeServiceImplementations.getAllOrbitTypes();
    }

    @GetMapping("/{orbitTypeId}")
    public OrbitType getOrbitById(@PathVariable("orbitTypeId") int id) {
        return orbitTypeServiceImplementations.getOrbitTypeById(id);
    }

    @GetMapping("/name")
    public int getOrbitTypeIdByName(@RequestParam(required = false) String name) {
        return orbitTypeServiceImplementations.getOrbitTypeIdByName(name);
    }
}
