package com.smartgreenhouse.alphagrow.services;

import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.models.Usuario;

public interface AutenticacaoService {

	Login efetuarLogin(Login login);

	String validarAcesso(Login login);

	Usuario obterUsuario(String idUsuario);

	Login obterLogin(String idLogin);
	
}
