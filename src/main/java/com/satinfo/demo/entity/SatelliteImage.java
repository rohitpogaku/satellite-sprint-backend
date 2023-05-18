package com.satinfo.demo.entity;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "satellite_images")
public class SatelliteImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "satellite_id")
    private Long satelliteId;

    public SatelliteImage() {
    }

    public SatelliteImage(String name, byte[] image, Long satelliteId) {
        this.name = name;
        this.image = image;
        this.satelliteId = satelliteId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Long getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(Long satelliteId) {
        this.satelliteId = satelliteId;
    }

    @Override
    public String toString() {
        return "SatelliteImage [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + Arrays.toString(image) +
                ", satelliteId=" + satelliteId +
                ']';
    }
}
