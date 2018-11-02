package com.smartgreenhouse.alphagrow.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smartgreenhouse.alphagrow.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	
}
