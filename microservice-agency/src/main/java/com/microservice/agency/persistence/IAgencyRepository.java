package com.microservice.agency.persistence;

import com.microservice.agency.entities.Agency;
import org.springframework.data.repository.CrudRepository;

public interface IAgencyRepository extends CrudRepository<Agency, Long> {
}
