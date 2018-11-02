package com.smartgreenhouse.alphagrow.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smartgreenhouse.alphagrow.Rasp.Rasp;
import com.smartgreenhouse.alphagrow.models.Usuario;
import com.smartgreenhouse.alphagrow.repositories.RaspRepository;
import com.smartgreenhouse.alphagrow.repositories.UsuarioRepository;
import com.smartgreenhouse.alphagrow.service.RaspService;
import com.smartgreenhouse.alphagrow.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
