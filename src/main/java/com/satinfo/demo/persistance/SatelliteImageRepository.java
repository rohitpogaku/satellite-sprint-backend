package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.SatelliteImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SatelliteImageRepository extends JpaRepository<SatelliteImage, Long> {
    SatelliteImage findByName(String name);

    SatelliteImage findBySatelliteId(Long satelliteId);
}
