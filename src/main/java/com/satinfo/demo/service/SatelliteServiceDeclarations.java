package com.satinfo.demo.service;

import com.satinfo.demo.entity.SatelliteDataWithJoin;
import com.satinfo.demo.entity.Satellites;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface SatelliteServiceDeclarations {
    List<SatelliteDataWithJoin> getAllSatellites();

    Optional<Satellites> getSatelliteById(int id);

    Satellites getSatelliteByAgencyId(int id);

    void insertSatelliteIntoDatabase(Satellites satellite);
}
