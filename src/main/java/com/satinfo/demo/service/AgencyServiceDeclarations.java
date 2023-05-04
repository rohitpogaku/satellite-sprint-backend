package com.satinfo.demo.service;

import com.satinfo.demo.entity.Agency;

import java.util.List;

public interface AgencyServiceDeclarations {
    List<Agency> getAllAgencies();

    void insertAgency(Agency agency);

    void updateAgency(Agency agency);

    void deleteAgency(int id);

    Agency getAgencyById(int id);

    int getAgencyIdByName(String name);
}
