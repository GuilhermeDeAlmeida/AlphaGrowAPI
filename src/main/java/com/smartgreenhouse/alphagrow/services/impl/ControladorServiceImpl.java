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
	public Controlador consultarControlador(TipoControlador tipoControlador) {

		String controlador = tipoControlador.toString();
		Controlador resposta = new Controlador();
		
		
		switch (controlador) {
		case "TEMPERATURA":
			resposta.setTemperatura("--------28o--------");
			break;
		case "HUMIDADE":
			resposta.setHumidade("--------40%--------");
			break;
		case "PH":
			resposta.setPh("--------6%--------");
			break;
		case "LUMINOSIDADE":
			resposta.setLuminosidade("--------76--------");
			break;
		default:
			resposta.setHumidade("Deu errado cara");
			resposta.setTemperatura("Deu errado cara");
			resposta.setLuminosidade("Deu errado cara");
			resposta.setPh("Deu errado cara");
			break;
		}
		
		return resposta;
	}
	
	@Override
	public Teste testarMongoDB(Teste teste) {
		return testeRepository.save(teste);
	}

	
}
