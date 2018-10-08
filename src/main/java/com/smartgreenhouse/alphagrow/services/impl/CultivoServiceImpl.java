package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartgreenhouse.alphagrow.models.Cultivo;
import com.smartgreenhouse.alphagrow.repositories.CultivoRepository;
import com.smartgreenhouse.alphagrow.repositories.TesteRepository;
import com.smartgreenhouse.alphagrow.services.CultivoService;

public class CultivoServiceImpl implements CultivoService{

	@Autowired
	private CultivoRepository cultivoRepository;
	
	@Override
	public Cultivo obterCultivo(String id) {
		// TODO Auto-generated method stub
		return cultivoRepository.findById(id).get();
	}

	@Override
	public Cultivo salvarCultivo(Cultivo cultivo) {
		// TODO Auto-generated method stub
		return cultivoRepository.save(cultivo);
	}

	
	
}
