package com.satinfo.demo.service;

import com.satinfo.demo.entity.SatelliteDataWithJoin;
import com.satinfo.demo.entity.Satellites;
import com.satinfo.demo.persistance.SatelliteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SatelliteServiceImplementations implements SatelliteServiceDeclarations {
    private final SatelliteRepository satelliteRepository;

    @Autowired
    public SatelliteServiceImplementations(SatelliteRepository satelliteRepository) {
        this.satelliteRepository = satelliteRepository;
    }

    @Override
    @Transactional
    public List<SatelliteDataWithJoin> getAllSatellites() {
        return satelliteRepository.getAllSatellites();
    }

    @Override
    @Transactional
    public Optional<Satellites> getSatelliteById(int id) {
        return satelliteRepository.findById(id);
    }

    @Override
    @Transactional
    public Satellites getSatelliteByAgencyId(int id) {
        return satelliteRepository.findByAgencyId(id);
    }

    @Override
    public void insertSatelliteIntoDatabse(Satellites satellite) {
        satelliteRepository.save(satellite);
    }

}
