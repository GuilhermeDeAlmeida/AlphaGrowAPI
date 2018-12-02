package com.smartgreenhouse.alphagrow.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Atuador;

public interface AtuadorRepository  extends MongoRepository<Atuador, String>{
	List<Atuador> findByToken(String token);
}
