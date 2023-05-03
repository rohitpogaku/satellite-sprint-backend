package com.satinfo.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "satellites")
public class Satellites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "satellite_id")
    private int satelliteId;

    @Column(name = "satellite_name", unique = true)
    private String satelliteName;

    @Column(name = "description")
    private String description;

    @Column(name = "launch_date")
    private Date launchDate;

    @Column(name = "launch_mass")
    private Double launchMass;

    @Column(name = "launch_vehicle")
    private String launchVehicle;

    @JsonIgnore
    @Column(name = "orbit_type_id")
    private int orbitTypeId;

    @JsonIgnore
    @Column(name = "application_id")
    private int applicationId;

    @JsonIgnore
    @Column(name = "manufacturer_id")
    private int manufacturerId;

    @JsonIgnore
    @Column(name = "agency_id")
    private int agencyId;

    @JsonManagedReference
    @ManyToOne(targetEntity = OrbitType.class)
    @JoinColumn(name = "orbit_type_id", insertable = false, updatable = false)
    private OrbitType orbitType;

    @JsonManagedReference
    @ManyToOne(targetEntity = SatelliteApplication.class)
    @JoinColumn(name = "application_id", insertable = false, updatable = false)
    private SatelliteApplication satelliteApplication;

    @JsonManagedReference
    @ManyToOne(targetEntity = Manufacturer.class)
    @JoinColumn(name = "manufacturer_id", insertable = false, updatable = false)
    private Manufacturer manufacturer;

    @JsonManagedReference
    @ManyToOne(targetEntity = Agency.class)
    @JoinColumn(name = "agency_id", insertable = false, updatable = false)
    private Agency agency;

    public Satellites() {
    }

    public Satellites(String satelliteName, String description, Date launchDate, Double launchMass, String launchVehicle, int orbitTypeId, int applicationId, int manufacturerId, int agencyId, OrbitType orbitType, SatelliteApplication satelliteApplication, Manufacturer manufacturer, Agency agency) {
        this.satelliteName = satelliteName;
        this.description = description;
        this.launchDate = launchDate;
        this.launchMass = launchMass;
        this.launchVehicle = launchVehicle;
        this.orbitTypeId = orbitTypeId;
        this.applicationId = applicationId;
        this.manufacturerId = manufacturerId;
        this.agencyId = agencyId;
        this.orbitType = orbitType;
        this.satelliteApplication = satelliteApplication;
        this.manufacturer = manufacturer;
        this.agency = agency;
    }

    public int getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(int satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public Double getLaunchMass() {
        return launchMass;
    }

    public void setLaunchMass(Double launchMass) {
        this.launchMass = launchMass;
    }

    public String getLaunchVehicle() {
        return launchVehicle;
    }

    public void setLaunchVehicle(String launchVehicle) {
        this.launchVehicle = launchVehicle;
    }

    public int getOrbitTypeId() {
        return orbitTypeId;
    }

    public void setOrbitTypeId(int orbitTypeId) {
        this.orbitTypeId = orbitTypeId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public int getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(int agencyId) {
        this.agencyId = agencyId;
    }

    public OrbitType getOrbitType() {
        return orbitType;
    }

    public void setOrbitType(OrbitType orbitType) {
        this.orbitType = orbitType;
    }

    public SatelliteApplication getSatelliteApplication() {
        return satelliteApplication;
    }

    public void setSatelliteApplication(SatelliteApplication satelliteApplication) {
        this.satelliteApplication = satelliteApplication;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Satellites [" +
                "satelliteId=" + satelliteId +
                ", satelliteName='" + satelliteName + '\'' +
                ", description='" + description + '\'' +
                ", launchDate=" + launchDate +
                ", launchMass=" + launchMass +
                ", launchVehicle='" + launchVehicle + '\'' +
                ", orbitTypeId=" + orbitTypeId +
                ", applicationId=" + applicationId +
                ", manufacturerId=" + manufacturerId +
                ", agencyId=" + agencyId +
                ", orbitType=" + orbitType +
                ", satelliteApplication=" + satelliteApplication +
                ", manufacturer=" + manufacturer +
                ", agency=" + agency +
                ']';
    }
}
