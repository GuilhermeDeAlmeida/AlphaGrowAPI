package com.smartgreenhouse.alphagrow.services;

import java.util.List;

import com.smartgreenhouse.alphagrow.models.Login;

public interface LoginService {
	Login salvarConta(Login login);

	void deletarConta(String id);

	List<Login> listarLogins();

}
