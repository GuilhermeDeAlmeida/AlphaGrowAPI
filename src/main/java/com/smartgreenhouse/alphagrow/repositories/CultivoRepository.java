package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Cultivo;

public interface CultivoRepository extends MongoRepository<Cultivo, String>{
	
}
