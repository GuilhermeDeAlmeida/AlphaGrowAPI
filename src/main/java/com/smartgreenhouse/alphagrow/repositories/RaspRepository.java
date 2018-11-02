package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.Rasp.Rasp;

public interface RaspRepository extends MongoRepository<Rasp, String>{

	Rasp findByToken(String token);
}
