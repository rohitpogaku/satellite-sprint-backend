package com.satinfo.demo.entity;

import java.sql.Date;
import java.util.Objects;

public class SatelliteDataWithJoin {
    private final Integer satellite_id;
    private final String satellite_name;
    private final String description;
    private final Date launch_date;
    private final Double launch_mass;
    private final String launch_vehicle;
    private final String orbit_type;
    private final String application;
    private final String manufacturer;
    private final String manufacturer_country;
    private final String agency;
    private final String agency_country;

    public SatelliteDataWithJoin(Integer satellite_id, String satellite_name, String description, Date launch_date, Double launch_mass, String launch_vehicle, String orbit_type, String application, String manufacturer, String manufacturer_country, String agency, String agency_country) {
        this.satellite_id = satellite_id;
        this.satellite_name = satellite_name;
        this.description = description;
        this.launch_date = launch_date;
        this.launch_mass = launch_mass;
        this.launch_vehicle = launch_vehicle;
        this.orbit_type = orbit_type;
        this.application = application;
        this.manufacturer = manufacturer;
        this.manufacturer_country = manufacturer_country;
        this.agency = agency;
        this.agency_country = agency_country;
    }

    public Integer getSatellite_id() {
        return satellite_id;
    }

    public String getSatellite_name() {
        return satellite_name;
    }

    public String getDescription() {
        return description;
    }

    public Date getLaunch_date() {
        return launch_date;
    }

    public Double getLaunch_mass() {
        return launch_mass;
    }

    public String getLaunch_vehicle() {
        return launch_vehicle;
    }

    public String getOrbit_type() {
        return orbit_type;
    }

    public String getApplication() {
        return application;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getManufacturer_country() {
        return manufacturer_country;
    }

    public String getAgency() {
        return agency;
    }

    public String getAgency_country() {
        return agency_country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SatelliteDataWithJoin that = (SatelliteDataWithJoin) o;
        return Objects.equals(satellite_id, that.satellite_id) && Objects.equals(satellite_name, that.satellite_name) && Objects.equals(description, that.description) && Objects.equals(launch_date, that.launch_date) && Objects.equals(launch_mass, that.launch_mass) && Objects.equals(launch_vehicle, that.launch_vehicle) && Objects.equals(orbit_type, that.orbit_type) && Objects.equals(application, that.application) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(manufacturer_country, that.manufacturer_country) && Objects.equals(agency, that.agency) && Objects.equals(agency_country, that.agency_country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(satellite_id, satellite_name, description, launch_date, launch_mass, launch_vehicle, orbit_type, application, manufacturer, manufacturer_country, agency, agency_country);
    }

    @Override
    public String toString() {
        return "SatelliteDataWithJoin [" +
                "satellite_id=" + satellite_id +
                ", satellite_name='" + satellite_name + '\'' +
                ", description='" + description + '\'' +
                ", launch_date=" + launch_date +
                ", launch_mass=" + launch_mass +
                ", launch_vehicle='" + launch_vehicle + '\'' +
                ", orbit_type='" + orbit_type + '\'' +
                ", application='" + application + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturer_country='" + manufacturer_country + '\'' +
                ", agency='" + agency + '\'' +
                ", agency_country='" + agency_country + '\'' +
                ']';
    }
}
