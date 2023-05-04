package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.OrbitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrbitTypeRepository extends JpaRepository<OrbitType, Integer> {
    @Query("SELECT ot.id FROM OrbitType ot WHERE ot.orbit = :name")
    int findIdByName(String name);
}
