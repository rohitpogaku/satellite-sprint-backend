package com.satinfo.demo.service;

import com.satinfo.demo.entity.Agency;
import com.satinfo.demo.persistance.AgencyRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyServiceImplementations implements AgencyServiceDeclarations {
    private final AgencyRepository agencyRepository;

    @Autowired
    public AgencyServiceImplementations(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    @Override
    @Transactional
    public List<Agency> getAllAgencies() {
        return agencyRepository.findAll();
    }

    @Override
    @Transactional
    public void insertAgency(Agency agency) {
        agencyRepository.save(agency);
    }

    @Override
    @Transactional
    public void updateAgency(Agency agency) {
        agencyRepository.save(agency);
    }

    @Override
    @Transactional
    public void deleteAgency(int id) {
        agencyRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Agency getAgencyById(int id) {
        return agencyRepository.findById(id).get();
    }

    @Override
    @Transactional
    public int getAgencyIdByName(String name) {
        return agencyRepository.findIdByName(name);
    }


}
