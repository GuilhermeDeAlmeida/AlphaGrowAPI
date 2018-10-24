package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Login;

public interface AutenticacaoRepository extends MongoRepository<Login, String> {

	Login findByEmail(String email);
}
