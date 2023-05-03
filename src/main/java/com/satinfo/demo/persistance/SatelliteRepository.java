package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.Satellites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SatelliteRepository extends JpaRepository<Satellites, Integer> {

}
