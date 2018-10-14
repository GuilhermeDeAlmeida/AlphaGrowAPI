package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.ControladorRasp;

public interface ControladorRaspRepository  extends MongoRepository<ControladorRasp, String>{

}
