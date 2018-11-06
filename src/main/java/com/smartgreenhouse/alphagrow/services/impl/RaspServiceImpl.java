package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartgreenhouse.alphagrow.Rasp.Rasp;
import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.repositories.LoginRepository;
import com.smartgreenhouse.alphagrow.repositories.RaspRepository;
import com.smartgreenhouse.alphagrow.service.RaspService;

@Service
public class RaspServiceImpl implements RaspService {

	@Autowired
	private RaspRepository raspRepository;
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Rasp salvarRasp(Rasp rasp) {

		return raspRepository.save(rasp);
	}

	@Override
	public ControladorRasp obterControladoresIdeais(String token) {
		ControladorRasp controladorRasp = new ControladorRasp();
		Rasp rasp = loginRepository.findByToken(token).getUsuario().getRasp();
		for (Ciclo ciclo : rasp.getCultivo().getCiclos()) {
			if (ciclo.getCicloAtual()) {
				controladorRasp = ciclo.getControladoresIdeal();
			}
		}
		return controladorRasp;
	}

}
