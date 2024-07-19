package com.microservice.agency.http.response;

import com.microservice.agency.dto.CarDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarByAgencyResponse {

    private String agencyName;
    private String seller;
    private List<CarDTO> carDTOList;
}
