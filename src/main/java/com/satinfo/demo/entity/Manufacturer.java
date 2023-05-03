package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "manufacturer_name", unique = true)
    private String ManufacturerName;

    @Column(name = "manufacturer_country")
    private String ManufacturerCountry;

    @JsonBackReference
    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Satellites> satellites;

    public Manufacturer() {
    }

    public Manufacturer(String manufacturerName, String manufacturerCountry, Set<Satellites> satellites) {
        ManufacturerName = manufacturerName;
        ManufacturerCountry = manufacturerCountry;
        this.satellites = satellites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return ManufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        ManufacturerName = manufacturerName;
    }

    public String getManufacturerCountry() {
        return ManufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        ManufacturerCountry = manufacturerCountry;
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
                ", ManufacturerName='" + ManufacturerName + '\'' +
                ", ManufacturerCountry='" + ManufacturerCountry + '\'' +
                ", satellites=" + satellites +
                ']';
    }
}
