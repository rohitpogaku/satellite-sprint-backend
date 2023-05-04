package com.satinfo.demo.service;

import com.satinfo.demo.entity.OrbitType;
import com.satinfo.demo.persistance.OrbitTypeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrbitTypeServiceImplementations implements OrbitTypeServiceDeclarations {
    private final OrbitTypeRepository orbitTypeRepository;

    @Autowired
    public OrbitTypeServiceImplementations(OrbitTypeRepository orbitTypeRepository) {
        this.orbitTypeRepository = orbitTypeRepository;
    }

    @Override
    @Transactional
    public List<OrbitType> getAllOrbitTypes() {
        return orbitTypeRepository.findAll();
    }

    @Override
    @Transactional
    public OrbitType getOrbitTypeById(int id) {
        return orbitTypeRepository.findById(id).get();
    }

    @Override
    @Transactional
    public int getOrbitTypeIdByName(String name) {
        return orbitTypeRepository.findIdByName(name);
    }
}
