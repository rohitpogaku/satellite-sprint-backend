package com.satinfo.demo.service;

import com.satinfo.demo.entity.SatelliteImage;
import com.satinfo.demo.persistance.SatelliteImageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SatelliteImageServiceImplementations implements SatelliteImageServiceDeclarations {
    private final SatelliteImageRepository satelliteImageRepository;

    @Autowired
    public SatelliteImageServiceImplementations(SatelliteImageRepository satelliteImageRepository) {
        this.satelliteImageRepository = satelliteImageRepository;
    }

    @Override
    @Transactional
    public SatelliteImage saveImage(SatelliteImage satelliteImage) {
        return satelliteImageRepository.save(satelliteImage);
    }

    @Override
    @Transactional
    public SatelliteImage getImageByName(String name) {
        return satelliteImageRepository.findByName(name);
    }

    @Override
    public SatelliteImage getImageBySatelliteId(Long satelliteId) {
        return satelliteImageRepository.findBySatelliteId(satelliteId);
    }
}
