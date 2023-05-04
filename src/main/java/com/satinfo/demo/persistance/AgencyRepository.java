package com.satinfo.demo.persistance;

import com.satinfo.demo.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<Agency, Integer> {
    @Query("SELECT a.id FROM Agency a WHERE a.name = :name")
    int findIdByName(String name);
}
