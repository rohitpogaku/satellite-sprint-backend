package com.satinfo.demo.service;

import com.satinfo.demo.entity.SatelliteApplication;
import com.satinfo.demo.persistance.SatelliteApplicationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SatelliteApplicationServiceImplementations implements SatelliteApplicationServiceDeclarations {
    private final SatelliteApplicationRepository satelliteApplicationRepository;

    @Autowired
    public SatelliteApplicationServiceImplementations(SatelliteApplicationRepository satelliteApplicationRepository) {
        this.satelliteApplicationRepository = satelliteApplicationRepository;
    }

    @Override
    @Transactional
    public List<SatelliteApplication> getAllSatelliteApplications() {
        return satelliteApplicationRepository.findAll();
    }

    @Override
    @Transactional
    public SatelliteApplication getSatelliteApplicationById(int id) {
        return satelliteApplicationRepository.findById(id).get();
    }

    @Override
    @Transactional
    public int getSatelliteIdByName(String name) {
        return satelliteApplicationRepository.findIdByName(name);
    }
}
