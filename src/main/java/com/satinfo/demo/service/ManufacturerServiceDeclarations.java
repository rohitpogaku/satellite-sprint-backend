package com.satinfo.demo.service;

import com.satinfo.demo.entity.Manufacturer;

import java.util.List;

public interface ManufacturerServiceDeclarations {
    List<Manufacturer> getAllManufacturers();

    void insertManufacturer(Manufacturer manufacturer);

    void updateManufacturer(Manufacturer manufacturer);

    void deleteManufacturer(int id);

    Manufacturer getManufacturerById(int id);

    int getManufacturerIdByName(String name);
}
