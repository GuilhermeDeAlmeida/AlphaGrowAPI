package com.smartgreenhouse.alphagrow.services.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.repositories.LoginRepository;
import com.smartgreenhouse.alphagrow.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login salvarConta(Login login) {

		return loginRepository.save(login);
	}

	@Override
	public void deletarConta(String id) {
		// TODO Auto-generated method stub
		loginRepository.deleteById(id);
	}

	@Override
	public List<Login> listarLogins() {
		
		return loginRepository.findAll();
	}
}
