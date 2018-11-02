package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Login;

public interface LoginRepository  extends MongoRepository<Login, String>{
}
