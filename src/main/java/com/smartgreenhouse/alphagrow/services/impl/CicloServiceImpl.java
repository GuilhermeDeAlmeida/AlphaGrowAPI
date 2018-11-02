package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.repositories.CicloRepository;
import com.smartgreenhouse.alphagrow.repositories.LoginRepository;
import com.smartgreenhouse.alphagrow.services.CicloService;
import com.smartgreenhouse.alphagrow.services.LoginService;

@Service
public class CicloServiceImpl implements CicloService {

	@Autowired
	private CicloRepository cicloRepository;

	@Override
	public Ciclo salvarCiclo(Ciclo ciclo) {
		return cicloRepository.save(ciclo);
	}


}
