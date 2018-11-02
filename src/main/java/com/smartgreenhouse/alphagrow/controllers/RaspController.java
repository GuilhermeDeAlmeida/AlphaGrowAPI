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

import com.smartgreenhouse.alphagrow.Rasp.Rasp;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.service.RaspService;

@RestController
@RequestMapping("/api/rasp")
public class RaspController {

	@Autowired
	private RaspService raspService;

	@GetMapping("/{token}")
	public ResponseEntity<ControladorRasp> obterControladorIdeal(@PathVariable(value = "token") String token){
//			@RequestParam String token) {
		return ResponseEntity.ok(raspService.obterControladoresIdeais(token));
	}
	
	@PostMapping()
	public ResponseEntity<Rasp> salvarRasp(@RequestBody Rasp rasp){
		return ResponseEntity.ok(raspService.salvarRasp(rasp));
	}

}
