package com.satinfo.demo.controller;

import com.satinfo.demo.entity.Agency;
import com.satinfo.demo.service.AgencyServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/agencies")
public class AgencyController {
    private final AgencyServiceImplementations agencyServiceImplementations;

    @Autowired
    public AgencyController(AgencyServiceImplementations agencyServiceImplementations) {
        this.agencyServiceImplementations = agencyServiceImplementations;
    }

    @GetMapping
    public List<Agency> getAllAgencies() {
        return agencyServiceImplementations.getAllAgencies();
    }

    @GetMapping("/{agencyId}")
    public Agency getAgencyById(@PathVariable("agencyId") int id) {
        return agencyServiceImplementations.getAgencyById(id);
    }

    @GetMapping("/name")
    public int getAgencyIdByName(@RequestParam(required = false, defaultValue = "isro") String name) {
        return agencyServiceImplementations.getAgencyIdByName(name);
    }

    @PostMapping
    public void insertAgency(@RequestBody Agency agency) {
        agency.setId(0);
        agencyServiceImplementations.insertAgency(agency);
    }

    @PutMapping
    public void updateAgency(@RequestBody Agency agency) {
        agencyServiceImplementations.updateAgency(agency);
    }

    @DeleteMapping("/{agencyId}")
    public void deleteAgency(@PathVariable("agencyId") int id) {
        agencyServiceImplementations.deleteAgency(id);
    }

}
