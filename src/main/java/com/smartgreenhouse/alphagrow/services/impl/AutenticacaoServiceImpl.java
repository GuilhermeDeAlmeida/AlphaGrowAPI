package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.repositories.AutenticacaoRepository;
import com.smartgreenhouse.alphagrow.services.AutenticacaoService;

public class AutenticacaoServiceImpl implements AutenticacaoService {

	@Autowired
	private AutenticacaoRepository autenticacaoRepository;
	
	@Override
	public Boolean efetuarLogin(Login login) {

		Login loginConsultado = autenticacaoRepository.findByEmail(login.getEmail());
		return login.getSenha().equals(loginConsultado.getSenha());
	}

}
