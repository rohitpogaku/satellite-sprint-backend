package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.SatelliteDataWithJoin;
import com.satinfo.demo.entity.Satellites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SatelliteRepository extends JpaRepository<Satellites, Integer> {

    @Query("""
            select new com.satinfo.demo.entity.SatelliteDataWithJoin(
                s.satelliteId,
                s.satelliteName,
                s.description,
                s.launchDate,
                s.launchMass,
                s.launchVehicle,
                ot.orbit,
                sa.application,
                m.name,
                m.country,
                a.name,
                a.country
            )
            from Satellites s
            join OrbitType ot on s.orbitTypeId = ot.id
            join SatelliteApplication sa on s.applicationId = sa.id
            join Manufacturer m on s.manufacturerId = m.id
            join Agency a on s.agencyId = a.id
                        
            """)
    List<SatelliteDataWithJoin> getAllSatellites();


    Satellites findByAgencyId(int id);
}
