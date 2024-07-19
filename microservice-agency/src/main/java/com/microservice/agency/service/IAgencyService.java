package com.microservice.agency.service;

import com.microservice.agency.entities.Agency;
import com.microservice.agency.http.response.CarByAgencyResponse;

import java.util.List;

public interface IAgencyService {

    List<Agency> findAll();

    Agency findById(Long id);

    void save (Agency agency);

    CarByAgencyResponse findCarsByIdAgency(Long idAgency);
}
