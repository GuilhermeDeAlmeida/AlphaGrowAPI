package com.smartgreenhouse.alphagrow.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.repositories.ControladorRaspRepository;
import com.smartgreenhouse.alphagrow.repositories.ControladorRepository;
import com.smartgreenhouse.alphagrow.services.ControladorService;

@Service
public class ControladorServiceImpl implements ControladorService{

	@Autowired
	private ControladorRepository controladorRepository;
	

	@Autowired
	private ControladorRaspRepository controladorRaspRepository;
	
	@Override 
	public List<Controlador> consultarControladores() {
		return controladorRepository.findAll();
	}

	@Override
	public Controlador salvarControlador(Controlador controlador) {
		return controladorRepository.save(controlador);
	}

	@Override
	public ControladorRasp salvarControladorRasp(ControladorRasp controladorRasp) {
		return controladorRaspRepository.save(controladorRasp);
	}

	
}
