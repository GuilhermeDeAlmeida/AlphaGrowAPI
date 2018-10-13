package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartgreenhouse.alphagrow.models.Cultivo;
import com.smartgreenhouse.alphagrow.repositories.CultivoRepository;
import com.smartgreenhouse.alphagrow.services.CultivoService;

public class CultivoServiceImpl implements CultivoService{

	
	@Autowired
	private CultivoRepository cultivoRepository;
	
	@Override
	public Cultivo buscarCultivo(String id) {
		return cultivoRepository.findById(id).get();
	}

	@Override
	public Cultivo cadastrarCultivo(Cultivo cultivo) {
		return cultivoRepository.save(cultivo);
	}

}
