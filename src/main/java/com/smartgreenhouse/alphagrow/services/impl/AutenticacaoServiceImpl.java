package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgreenhouse.alphagrow.models.Autenticacao;
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
		return loginRepository.findById(idLogin).get();
	}

}
