package com.smartgreenhouse.alphagrow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.models.Cultivo;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.models.Usuario;
import com.smartgreenhouse.alphagrow.services.AutenticacaoService;

@RestController
@RequestMapping("/api/autenticacao")
public class AutenticacaoController {

	@Autowired
	private AutenticacaoService autenticacaoService;

	@PostMapping
	public ResponseEntity<String> efetuarLogin(@RequestBody Login login) {
		return ResponseEntity.ok(autenticacaoService.validarAcesso(login));
	}

	@GetMapping("/obterUsuario{id}")
	public ResponseEntity<Usuario> obterUsuario(@RequestParam("idUsuario")String idUsuario){
		return ResponseEntity.ok(autenticacaoService.obterUsuario(idUsuario));
	}
	
	@GetMapping()
	public ResponseEntity<Login> obterLogin(@RequestParam("idLogin")String idLogin){
//	public ResponseEntity<Usuario> obterUsuario(@PathVariable(value = "idUsuario") String idUsuario) {
		return ResponseEntity.ok(autenticacaoService.obterLogin(idLogin));
	}
	
//	@GetMapping("/obterCultivo{id}")
//	public ResponseEntity<Cultivo> obterCultivo(@RequestParam("idCultivo")String idCultivo){
//		return ResponseEntity.ok(cultivoService.buscarCultivo(idCultivo));
//	}
}
