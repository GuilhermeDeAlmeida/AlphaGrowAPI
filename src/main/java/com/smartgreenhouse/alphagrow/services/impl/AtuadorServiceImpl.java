package com.smartgreenhouse.alphagrow.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.file.writer.AtuadorWriter;
import com.smartgreenhouse.alphagrow.models.Atuador;
import com.smartgreenhouse.alphagrow.services.AtuadorService;

@Service
public class AtuadorServiceImpl implements AtuadorService{

	@Override
	public List<Atuador> obterListaAtuadores(String token) {
		
		return obterAtuadoresGenericos();
	}
	
	private List<Atuador> obterAtuadoresGenericos() {
		List<Atuador> atuadores = new ArrayList<>();
		Atuador atuador = new Atuador("ventilador1", false, "RASPBERRYADRIANO");
		atuadores.add(atuador);
		atuador = new Atuador("ventilador2", true, "RASPBERRYADRIANO");
		atuadores.add(atuador);
		atuador = new Atuador("bomba-agua", false, "RASPBERRYADRIANO");
		atuadores.add(atuador);
		
		return atuadores;
	}



	@Override
	public Atuador salvarAtuador(Atuador atuador) {
		AtuadorWriter.escreverAtuador(atuador);
		return null;
	}

}
