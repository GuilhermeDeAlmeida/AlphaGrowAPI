package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.entities.Teste;
import com.smartgreenhouse.alphagrow.enums.TipoControlador;
import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.repositories.TesteRepository;
import com.smartgreenhouse.alphagrow.services.ControladorService;

@Service
public class ControladorServiceImpl implements ControladorService{

	@Autowired
	private TesteRepository testeRepository;
	
	@Override
	public String teste() {
		return "Teste vindo de dentro da implementacao da interface ControladorService";
	}

	@Override 
	public Controlador consultarControladores() {
		return null;
	}

	
	@Override
	public Teste testarMongoDB(Teste teste) {
		return testeRepository.save(teste);
	}

	
}
