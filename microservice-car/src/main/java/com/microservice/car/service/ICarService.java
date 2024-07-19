package com.microservice.car.service;

import com.microservice.car.entities.Car;

import java.util.List;

public interface ICarService {

    List<Car> findAll();

    Car findById(Long id);

    void save (Car car);

    List<Car> findByIdAgency(Long idAgency);
}
