package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "satellite_application")
public class SatelliteApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "application", unique = true)
    private String application;

    @JsonBackReference
    @OneToMany(mappedBy = "satelliteApplication", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Satellites> satellites;

    public SatelliteApplication() {
    }

    public SatelliteApplication(String application, Set<Satellites> satellites) {
        this.application = application;
        this.satellites = satellites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Set<Satellites> getSatellites() {
        return satellites;
    }

    public void setSatellites(Set<Satellites> satellites) {
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "SatelliteApplication [" +
                "id=" + id +
                ", application='" + application + '\'' +
                ", satellites=" + satellites +
                ']';
    }
}
