package com.smartgreenhouse.alphagrow.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.Rasp.Rasp;
import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.repositories.ControladorRaspRepository;
import com.smartgreenhouse.alphagrow.repositories.ControladorRepository;
import com.smartgreenhouse.alphagrow.repositories.LoginRepository;
import com.smartgreenhouse.alphagrow.repositories.RaspRepository;
import com.smartgreenhouse.alphagrow.services.ControladorService;

@Service
public class ControladorServiceImpl implements ControladorService{

	@Autowired
	private ControladorRepository controladorRepository;
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private ControladorRaspRepository controladorRaspRepository;
	
	@Autowired
	private RaspRepository raspRepository;
	
	@Override 
	public List<Controlador> consultarControladores() {
		return controladorRepository.findAll();
	}

	@Override
	public ControladorRasp salvarControladorRasp(ControladorRasp controladorRasp) {
		//buscar o rasp que tem o token do controladorRasp
		
		Login login = loginRepository.findByToken(controladorRasp.getToken());
		Ciclo ciclo = login.getUsuario().getRasp().getCultivo().getCicloAtual();
		//inserir controladores dentro do rasp.cultivo.getCicloAtual().controladores atual
		
		List<Controlador> controladores = new ArrayList<>();
		Controlador controlador = new Controlador("umidade", controladorRasp.getUmidade());
		controladores.add(controlador);
		controlador = new Controlador("temperatura", controladorRasp.getTemperatura());
		controladores.add(controlador);
		ciclo.setControladoresAtual(controladores);
		
		login = loginRepository.save(login);
		
		controladorRasp.setDataRegistro(new Date());
		return controladorRaspRepository.save(controladorRasp);
	}

	@Override
	public List<ControladorRasp> consultarControladoresRasp() {
		return controladorRaspRepository.findAll();
	}

	@Override
	public List<Controlador> obterControladoresIdeias() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
