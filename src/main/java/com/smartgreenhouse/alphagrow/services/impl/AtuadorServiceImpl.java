package com.smartgreenhouse.alphagrow.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.file.writer.AtuadorWriter;
import com.smartgreenhouse.alphagrow.models.Atuador;
import com.smartgreenhouse.alphagrow.repositories.AtuadorRepository;
import com.smartgreenhouse.alphagrow.services.AtuadorService;

@Service
public class AtuadorServiceImpl implements AtuadorService{

	@Autowired
	AtuadorRepository atuadorRepository;
	@Override
	public List<Atuador> obterListaAtuadores(String token) {
	
//		return AtuadorWriter.obterAtuadores(token);
		return atuadorRepository.findByToken(token);
	}

	@Override
	public Boolean salvarAtuador(Atuador atuador) {
		atuadorRepository.save(atuador);
//		return AtuadorWriter.escreverAtuador(atuador);
		return true;
	}

}
