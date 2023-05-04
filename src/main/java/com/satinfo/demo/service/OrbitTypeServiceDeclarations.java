package com.satinfo.demo.service;

import com.satinfo.demo.entity.OrbitType;

import java.util.List;

public interface OrbitTypeServiceDeclarations {
    List<OrbitType> getAllOrbitTypes();

    OrbitType getOrbitTypeById(int id);

    int getOrbitTypeIdByName(String name);
}
