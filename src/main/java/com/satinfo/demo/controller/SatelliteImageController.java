package com.satinfo.demo.controller;

import com.satinfo.demo.entity.SatelliteImage;
import com.satinfo.demo.entity.Satellites;
import com.satinfo.demo.service.SatelliteImageServiceImplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/images")
public class SatelliteImageController {
    private final SatelliteImageServiceImplementations satelliteImageServiceImplementations;


    @Autowired
    public SatelliteImageController(SatelliteImageServiceImplementations satelliteImageServiceImplementations) {
        this.satelliteImageServiceImplementations = satelliteImageServiceImplementations;
    }


    @PostMapping
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file, @RequestParam("ID") Long id) {
        try {
            SatelliteImage newImage = new SatelliteImage(file.getOriginalFilename(), file.getBytes(), id);
            SatelliteImage image = satelliteImageServiceImplementations.saveImage(newImage);
            return ResponseEntity.ok(image);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<?> getImageById(@PathVariable("name") String name) {
        SatelliteImage image = satelliteImageServiceImplementations.getImageByName(name);
        if (image != null) {
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image.getImage());
//            return ResponseEntity.ok(image);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getImageById(@PathVariable("id") Long id) {
        SatelliteImage image = satelliteImageServiceImplementations.getImageBySatelliteId(id);
        if (image != null) {
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image.getImage());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
