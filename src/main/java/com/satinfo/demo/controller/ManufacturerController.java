package com.satinfo.demo.controller;

import com.satinfo.demo.entity.Manufacturer;
import com.satinfo.demo.service.ManufacturerServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manufacturer")
public class ManufacturerController {
    private final ManufacturerServiceImplementations manufacturerServiceImplementations;

    @Autowired
    public ManufacturerController(ManufacturerServiceImplementations manufacturerServiceImplementations) {
        this.manufacturerServiceImplementations = manufacturerServiceImplementations;
    }

    @GetMapping
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerServiceImplementations.getAllManufacturers();
    }

    @GetMapping("/{manufacturerId}")
    public Manufacturer getManufacturerById(@PathVariable("manufacturerId") int id) {
        return manufacturerServiceImplementations.getManufacturerById(id);
    }

    @GetMapping("/name")
    public int getManufacturerIdByName(@RequestParam(required = false) String name) {
        return manufacturerServiceImplementations.getManufacturerIdByName(name);
    }

    @PostMapping
    public void insertManufacturer(@RequestBody Manufacturer manufacturer) {
        manufacturer.setId(0);
        manufacturerServiceImplementations.insertManufacturer(manufacturer);
    }

    @PutMapping
    public void updateManufacturer(@RequestBody Manufacturer manufacturer) {
        manufacturerServiceImplementations.updateManufacturer(manufacturer);
    }

    @DeleteMapping("/{manufacturerId}")
    public void deleteManufacturer(@PathVariable("manufacturerId") int id) {
        manufacturerServiceImplementations.deleteManufacturer(id);
    }
}
