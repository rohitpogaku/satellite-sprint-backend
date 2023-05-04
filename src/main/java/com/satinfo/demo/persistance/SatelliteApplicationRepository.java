package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.SatelliteApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SatelliteApplicationRepository extends JpaRepository<SatelliteApplication, Integer> {
    @Query("SELECT sa.id FROM SatelliteApplication sa WHERE sa.application = :name")
    int findIdByName(String name);
}
