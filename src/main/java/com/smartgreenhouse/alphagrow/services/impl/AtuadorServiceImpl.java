package com.smartgreenhouse.alphagrow.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.file.writer.AtuadorWriter;
import com.smartgreenhouse.alphagrow.models.Atuador;
import com.smartgreenhouse.alphagrow.services.AtuadorService;

@Service
public class AtuadorServiceImpl implements AtuadorService{

	@Override
	public List<Atuador> obterListaAtuadores() {
		// TODO Auto-generated method stub	
		return null;
	}

	@Override
	public Atuador salvarAtuador(Atuador atuador) {
		AtuadorWriter.escreverAtuador(atuador);
		return null;
	}

}
