package com.microservice.agency.service;

import com.microservice.agency.client.ICarClient;
import com.microservice.agency.dto.CarDTO;
import com.microservice.agency.entities.Agency;
import com.microservice.agency.http.response.CarByAgencyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import com.microservice.agency.persistence.IAgencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyServiceImpl implements IAgencyService{

    private ICarClient carClient;

    @Autowired
    private IAgencyRepository agencyRepository;

    @Override
    public List<Agency> findAll() {
        return (List<Agency>) agencyRepository.findAll();
    }

    @Override
    public Agency findById(Long id) {
        return agencyRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Agency agency) {
        agencyRepository.save(agency);
    }

    @Override
    public CarByAgencyResponse findCarsByIdAgency(Long idAgency) {
        Agency agency = agencyRepository.findById(idAgency).orElse(new Agency());

        List<CarDTO> carDTOList = carClient.findAllCarByAgency(idAgency);

        return CarByAgencyResponse.builder()
                .agencyName(agency.getName())
                .seller(agency.getSeller())
                .carDTOList(carDTOList).build();
    }
}
