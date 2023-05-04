package com.satinfo.demo.service;

import com.satinfo.demo.entity.SatelliteApplication;

import java.util.List;

public interface SatelliteApplicationServiceDeclarations {
    List<SatelliteApplication> getAllSatelliteApplications();

    SatelliteApplication getSatelliteApplicationById(int id);

    int getSatelliteIdByName(String name);
}
