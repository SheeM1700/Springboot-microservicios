package com.microservice.agency.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    private String model;
    private Integer generation;
    private String color;
    private Long agencyId;
}
