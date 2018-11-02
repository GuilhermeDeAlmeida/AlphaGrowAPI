package com.smartgreenhouse.alphagrow.services.impl;
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
}
