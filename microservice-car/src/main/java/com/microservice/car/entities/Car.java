package com.microservice.car.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor


public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private Integer generation;
    private String color;

    @Column(name = "agency_id")
    private Long agencyId;
}
