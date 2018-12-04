package com.smartgreenhouse.alphagrow.services.impl;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.repositories.LoginRepository;
import com.smartgreenhouse.alphagrow.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login salvarConta(Login login) {

		gerarDatasCiclos(login.getUsuario().getRasp().getCultivo().getCiclos());
		return loginRepository.save(login);
	}

	private void gerarDatasCiclos(List<Ciclo> ciclos) {
		
		Date ultimaDataRegistrada = null;
		for (Ciclo ciclo : ciclos) {
			//Para o primeiro ciclo
			if(ultimaDataRegistrada == null) {
				ciclo.setDataInicio(new Date());
			}else {//para os demais
				ciclo.setDataInicio(ultimaDataRegistrada);
			}
			Calendar c = Calendar.getInstance();
			c.setTime(ciclo.getDataInicio());
			c.add(Calendar.DATE, ciclo.getDuracao());
			ciclo.setDataFim(c.getTime());
			ultimaDataRegistrada = ciclo.getDataFim();
		}
		
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
