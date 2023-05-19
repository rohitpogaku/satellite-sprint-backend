package com.satinfo.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.satinfo.demo.entity.Register;

@Repository
public interface RegisterRepositary extends JpaRepository<Register, Integer> {

    Register findByEmail(String email);

}

