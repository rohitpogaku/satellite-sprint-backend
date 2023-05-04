package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "country")
    private String country;

    @JsonBackReference
    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Satellites> satellites;

    public Manufacturer() {
    }

    public Manufacturer(String name, String country, Set<Satellites> satellites) {
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

    public void setName(String manufacturerName) {
        this.name = manufacturerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String manufacturerCountry) {
        this.country = manufacturerCountry;
    }

    public Set<Satellites> getSatellites() {
        return satellites;
    }

    public void setSatellites(Set<Satellites> satellites) {
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "Manufacturer [" +
                "id=" + id +
                ", ManufacturerName='" + name + '\'' +
                ", ManufacturerCountry='" + country + '\'' +
                ", satellites=" + satellites +
                ']';
    }
}
