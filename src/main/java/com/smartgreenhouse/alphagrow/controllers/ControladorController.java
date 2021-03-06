package com.smartgreenhouse.alphagrow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.services.ControladorService;

//Defindo que este cara eh um REST
@RestController
//Recursos ficarao disponiveis atraves da URL abaixo
@RequestMapping("/api/controlador")
public class ControladorController {
	
	@Autowired
	private ControladorService controladorService;
	
	//Controlador
	@GetMapping("/controladores")
	public ResponseEntity<List<Controlador>> getControladores(){
		return ResponseEntity.ok(controladorService.consultarControladores());
	}
	
	//Controlador Rasp
	@GetMapping("/controladoresRasp")
	public ResponseEntity<List<ControladorRasp>> getControladoresRasp(){
		return ResponseEntity.ok(controladorService.consultarControladoresRasp());
	}
	
	@PostMapping("/controladorRasp")
	public ResponseEntity<ControladorRasp> salvarControladorRasp(@RequestBody ControladorRasp controladorRasp){
		return ResponseEntity.ok(controladorService.salvarControladorRasp(controladorRasp));
	}	
	
	@GetMapping("")
	public ResponseEntity<List<Controlador>> obterControladoresIdeias(){
		return ResponseEntity.ok(controladorService.obterControladoresIdeias());
	}
	
}
