package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "agency")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "country")
    private String country;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonBackReference
    @OneToMany(mappedBy = "agency", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Satellites> satellites;

    public Agency() {
    }

    public Agency(String name, String country, Set<Satellites> satellites) {
        this.name = name;
        this.country = country;
        this.satellites = satellites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String agencyName) {
        this.name = agencyName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String agencyCountry) {
        this.country = agencyCountry;
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
                ", agencyName='" + name + '\'' +
                ", agencyCountry='" + country + '\'' +
                ", satellites=" + satellites +
                ']';
    }
}
