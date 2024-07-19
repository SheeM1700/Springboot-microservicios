package com.microservice.car.service;

import com.microservice.car.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import com.microservice.car.persistence.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<Car> findByIdAgency(Long idAgency) {
        return carRepository.findAllCar(idAgency);
    }
}
