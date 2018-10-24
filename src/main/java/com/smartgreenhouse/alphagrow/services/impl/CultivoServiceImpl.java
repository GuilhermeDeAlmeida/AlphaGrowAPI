package com.smartgreenhouse.alphagrow.services.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
		//Verificar o ciclo atual e atribuir o que foi armazenado pelo rasp
		//Para exibição no android
		for (Ciclo ciclo : cultivo.getCiclos()) {
			if(ciclo.getCicloAtual()) {
				ciclo.setControladoresAtual(obterControladores());
				ciclo.setDataFim(calcularDataFim(ciclo));
			}
		}
		return cultivo;
	}

	//Adicionará a duração a data de inicio
	//para obtermos o dia final
	private Date calcularDataFim(Ciclo ciclo) {
		Calendar c = Calendar.getInstance();
        c.setTime(ciclo.getDataInicio());
        c.add(Calendar.DATE, ciclo.getDuracao());
		return c.getTime();
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
		List<Controlador> controladores = converterControladores(controladorRaspRepository.findTopByOrderByDataRegistroDesc());
//		List<Controlador> controladores = new ArrayList<>();
		
		return controladores;
//		return controladores;
	}

	private List<Controlador> converterControladores(ControladorRasp controladorRasp) {
		List<Controlador> controladores = new ArrayList<>();
		
		Controlador temperatura = new Controlador("Temperatura", controladorRasp.getTemperatura());
		Controlador umidade = new Controlador("Umidade", controladorRasp.getUmidade());
		
		controladores.add(umidade);
		controladores.add(temperatura);
		
		return controladores;
	}

	@Override
	public List<Cultivo> obterCultivos() {
		return cultivoRepository.findAll();
	} 
	
	
}
