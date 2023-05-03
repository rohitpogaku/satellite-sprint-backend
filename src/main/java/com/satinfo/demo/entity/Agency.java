package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "agency")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agency_id")
    private int id;

    @Column(name = "agency_name", unique = true)
    private String agencyName;

    @Column(name = "country")
    private String agencyCountry;

    @JsonBackReference
    @OneToMany(mappedBy = "agency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Satellites> satellites;

    public Agency() {
    }

    public Agency(String agencyName, String agencyCountry, Set<Satellites> satellites) {
        this.agencyName = agencyName;
        this.agencyCountry = agencyCountry;
        this.satellites = satellites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyCountry() {
        return agencyCountry;
    }

    public void setAgencyCountry(String agencyCountry) {
        this.agencyCountry = agencyCountry;
    }

    public Set<Satellites> getSatellites() {
        return satellites;
    }

    public void setSatellites(Set<Satellites> satellites) {
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "Agency [" +
                "id=" + id +
                ", agencyName='" + agencyName + '\'' +
                ", agencyCountry='" + agencyCountry + '\'' +
                ", satellites=" + satellites +
                ']';
    }
}
