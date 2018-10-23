package com.smartgreenhouse.alphagrow.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.models.Cultivo;
import com.smartgreenhouse.alphagrow.repositories.ControladorRaspRepository;
import com.smartgreenhouse.alphagrow.repositories.CultivoRepository;
import com.smartgreenhouse.alphagrow.services.CultivoService;

@Service
public class CultivoServiceImpl implements CultivoService{

	
	@Autowired
	private CultivoRepository cultivoRepository;
	
	@Autowired
	private ControladorRaspRepository controladorRaspRepository;
	
	@Override
	public Cultivo buscarCultivo(String id) {
		Cultivo cultivo = cultivoRepository.findById(id).get();
		for (Ciclo ciclo : cultivo.getCiclos()) {
			if(ciclo.getCicloAtual()) {
				ciclo.setControladoresAtual(obterControladores());
			}
		}
		return cultivo;
	}

	@Override
	public Cultivo cadastrarCultivo(Cultivo cultivo) {
		return cultivoRepository.save(cultivo);
	}
	
	@Override
	public List<Cultivo> consultarPropriedades() {
		return cultivoRepository.findAll();
	}
	
	@Override
	public Cultivo salvarCultivo(Cultivo cultivo){
		return cultivoRepository.save(cultivo);
	}
	
	private List<Controlador> obterControladores(){
		List<Controlador> controladores = new ArrayList<>();
		
		List<ControladorRasp> controladoresRasp = controladorRaspRepository.findAll();
		
		ControladorRasp controladorRasp = controladoresRasp.get(controladoresRasp.size());
		
		Controlador temperatura = new Controlador("Temperatura", controladorRasp.getTemperatura());
		Controlador umidade = new Controlador("Umidade", controladorRasp.getUmidade());
		
		controladores.add(umidade);
		controladores.add(temperatura);
		
		return controladores;
	} 
}
