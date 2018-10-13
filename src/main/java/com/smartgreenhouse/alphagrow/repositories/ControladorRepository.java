package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Controlador;

public interface ControladorRepository extends MongoRepository<Controlador, String>{

}
