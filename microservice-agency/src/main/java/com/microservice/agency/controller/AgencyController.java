package com.microservice.agency.controller;

import com.microservice.agency.entities.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservice.agency.service.IAgencyService;

@RestController
@RequestMapping("api/agency")
public class AgencyController {

    @Autowired
    private IAgencyService agencyService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCar(@RequestBody Agency agency){
        agencyService.save(agency);
    }

    //Get all agency
    @GetMapping("/all")
    public ResponseEntity<?> findAllCar(){
        return ResponseEntity.ok(agencyService.findAll());
    }

    //Get Agency for id
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(agencyService.findById(id));
    }
}
