package com.rentup.controller;

import com.rentup.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
@CrossOrigin()
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/")
    public ResponseEntity<?> getAllCities(){
        return ResponseEntity.status(HttpStatus.OK).body(cityService.getAllCities());
    }

}
