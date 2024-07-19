package com.microservice.agency.client;


import com.microservice.agency.dto.CarDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-car", url = "localhost:8090/api/car")
public interface ICarClient {

    @GetMapping("/search-by-agency/{idAgency}")
    List<CarDTO> findAllCarByAgency(@PathVariable Long id);

}
