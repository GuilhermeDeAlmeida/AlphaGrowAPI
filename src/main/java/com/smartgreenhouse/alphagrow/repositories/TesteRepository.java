package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.entities.Teste;

public interface TesteRepository extends MongoRepository<Teste, String>{

	public Teste findByNome(String nome);
}
