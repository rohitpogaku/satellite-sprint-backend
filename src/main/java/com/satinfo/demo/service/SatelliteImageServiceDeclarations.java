package com.satinfo.demo.service;

import com.satinfo.demo.entity.SatelliteImage;

public interface SatelliteImageServiceDeclarations {
    SatelliteImage saveImage(SatelliteImage satelliteImage);

    SatelliteImage getImageByName(String name);

    SatelliteImage getImageBySatelliteId(Long satelliteId);
}
