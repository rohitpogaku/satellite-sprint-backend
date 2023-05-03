package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "orbit_type")
public class OrbitType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "orbit", unique = true)
    private String orbit;

    @JsonBackReference
    @OneToMany(mappedBy = "orbitType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Satellites> satellites;

    public OrbitType() {
    }

    public OrbitType(String orbit, Set<Satellites> satellites) {
        this.orbit = orbit;
        this.satellites = satellites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public Set<Satellites> getSatellites() {
        return satellites;
    }

    public void setSatellites(Set<Satellites> satellites) {
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "OrbitType [" +
                "id=" + id +
                ", orbit='" + orbit + '\'' +
                ", satellites=" + satellites +
                ']';
    }
}
