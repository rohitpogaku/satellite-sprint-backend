package com.satinfo.demo.service;

import com.satinfo.demo.entity.Satellites;

import java.util.List;
import java.util.Optional;

public interface SatelliteServiceDeclarations {
    List<Satellites> getAllSatellites();
    Optional<Satellites> getSatelliteById(int id);
}
