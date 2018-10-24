package com.smartgreenhouse.alphagrow.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.models.Login;

@RestController
@RequestMapping("/api/autenticacao")
public class AutenticacaoController {
	@PostMapping
	public ResponseEntity<Login> efetuarLogin(@RequestBody Login login){
		return ResponseEntity.ok(new Login());
	} 
}
