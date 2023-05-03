package com.satinfo.demo.service;

import com.satinfo.demo.entity.Satellites;
import com.satinfo.demo.persistance.SatelliteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SatelliteServiceImplementations implements SatelliteServiceDeclarations{
    private SatelliteRepository satelliteRepository;

    @Autowired
    public SatelliteServiceImplementations(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    @Override
    @Transactional
    public List<Satellites> getAllSatellites() {
        return satelliteRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Satellites> getSatelliteById(int id) {
        return satelliteRepository.findById(id);
    }
}
