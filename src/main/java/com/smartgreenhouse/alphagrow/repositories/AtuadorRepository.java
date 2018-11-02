package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Atuador;

public interface AtuadorRepository  extends MongoRepository<Atuador, String>{
}
