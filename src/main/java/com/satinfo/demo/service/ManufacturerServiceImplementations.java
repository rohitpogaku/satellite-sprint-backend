package com.satinfo.demo.service;

import com.satinfo.demo.entity.Manufacturer;
import com.satinfo.demo.persistance.ManufacturerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImplementations implements ManufacturerServiceDeclarations {
    private final ManufacturerRepository manufacturerRepository;

    @Autowired
    public ManufacturerServiceImplementations(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    @Transactional
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }

    @Override
    @Transactional
    public void insertManufacturer(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }

    @Override
    @Transactional
    public void updateManufacturer(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }

    @Override
    @Transactional
    public void deleteManufacturer(int id) {
        manufacturerRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Manufacturer getManufacturerById(int id) {
        return manufacturerRepository.findById(id).get();
    }

    @Override
    @Transactional
    public int getManufacturerIdByName(String name) {
        return manufacturerRepository.findIdByName(name);
    }
}
