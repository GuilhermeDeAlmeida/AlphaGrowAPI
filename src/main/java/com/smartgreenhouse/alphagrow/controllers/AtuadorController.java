package com.smartgreenhouse.alphagrow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.models.Atuador;
import com.smartgreenhouse.alphagrow.services.AtuadorService;

@RestController
@RequestMapping("/api/atuadores")
public class AtuadorController {
	
//	@Autowired
//	private AtuadorService atuadorService;
//	
//	
//	@GetMapping()
//	public ResponseEntity<List<Atuador>> getAtuadores(){
//		return ResponseEntity.ok(atuadorService.obterListaAtuadores());
//	}
//	
//	@PostMapping
//	public ResponseEntity<Atuador> salvarAtuador(@RequestBody Atuador atuador){
//		return ResponseEntity.ok(atuadorService.salvarAtuador(atuador));
//	}
//	
}
