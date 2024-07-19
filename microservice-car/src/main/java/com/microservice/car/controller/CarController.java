package com.microservice.car.controller;

import com.microservice.car.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.microservice.car.service.ICarService;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private ICarService carService;


    //Create a new car
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCar(@RequestBody Car car){
        carService.save(car);
    }

    //Get all car
    @GetMapping("/all")
    public ResponseEntity<?> findAllCar(){
        return ResponseEntity.ok(carService.findAll());
    }

    //Get car for id
    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(carService.findById(id));
    }

    //Get car by agency
    @GetMapping("/search-by-agency/{idAgency}")
    public ResponseEntity<?> findByAgency(@PathVariable Long idAgency){
        return ResponseEntity.ok(carService.findByIdAgency(idAgency));
    }
}
