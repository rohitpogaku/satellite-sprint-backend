package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
    @Query("SELECT m.id FROM Manufacturer m WHERE m.name = :name")
    int findIdByName(String name);
}
