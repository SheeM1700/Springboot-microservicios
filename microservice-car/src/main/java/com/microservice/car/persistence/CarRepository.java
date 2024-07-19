package com.microservice.car.persistence;

import com.microservice.car.entities.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Query("SELECT s FROM Car s WHERE s.agencyId = :idAgency")
    List<Car> findAllCar(Long idAgency);
}
