package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Ciclo;

public interface CicloRepository extends MongoRepository<Ciclo, String>{

}
