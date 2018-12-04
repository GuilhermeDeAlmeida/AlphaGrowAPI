package com.smartgreenhouse.alphagrow.services.impl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.models.Autenticacao;
import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.models.Usuario;
import com.smartgreenhouse.alphagrow.repositories.AutenticacaoRepository;
import com.smartgreenhouse.alphagrow.repositories.LoginRepository;
import com.smartgreenhouse.alphagrow.repositories.UsuarioRepository;
import com.smartgreenhouse.alphagrow.services.AutenticacaoService;

@Service
public class AutenticacaoServiceImpl implements AutenticacaoService {

	@Autowired
	private AutenticacaoRepository autenticacaoRepository;
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Login efetuarLogin(Login login) {
		Login loginConsultado = autenticacaoRepository.findByEmail(login.getEmail());
		return loginConsultado;
	}

	@Override
	public Autenticacao validarAcesso(Login login) {
		
		Login loginConsultado = loginRepository.findByEmail(login.getEmail());
		Autenticacao autenticacao = new Autenticacao();
		if(loginConsultado != null) {
			if(login.getSenha().equals(loginConsultado.getSenha())) {
				autenticacao.setAutenticado(true);
				autenticacao.setId(loginConsultado.getId());
				autenticacao.setToken(loginConsultado.getToken());
				return autenticacao;
			}else {
				autenticacao.setAutenticado(false);
				return autenticacao;
			}
		}
		return autenticacao;
	}

	@Override
	public Usuario obterUsuario(String idUsuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(idUsuario).get();
	}

	@Override
	public Login obterLogin(String idLogin) {
		Login login = loginRepository.findById(idLogin).get();
		validarCicloAtual(login);
		return login;
	}

	private void validarCicloAtual(Login login) {
		List<Ciclo> ciclos = login.getUsuario().getRasp().getCultivo().getCiclos();
		Ciclo cicloAtual = new Ciclo();
		boolean continuaCicloAtual = true;
		boolean proximoEhCicloAtual = false;
		for (Ciclo ciclo : ciclos) {
			if (proximoEhCicloAtual) {
				ciclo.setCicloAtual(true);
				proximoEhCicloAtual = false;
			}
			if (ciclo.getCicloAtual()) {
				cicloAtual = ciclo;
				continuaCicloAtual = validarDataCicloAtual(cicloAtual);
				if (!continuaCicloAtual) {
					proximoEhCicloAtual = true;
					ciclo.setCicloAtual(false);
				}
			}
		}
	}

	private boolean validarDataCicloAtual(Ciclo cicloAtual) {
		long diferencaDias = getDateDiff(new Date(), cicloAtual.getDataFim(), TimeUnit.DAYS);
		return diferencaDias > 0;
	}

	public static long getDateDiff(Date daaInicial, Date dataFinal, TimeUnit timeUnit) {
		long diffInMillies = dataFinal.getTime() - daaInicial.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}

}
