package com.smartgreenhouse.alphagrow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.services.CicloService;

@RestController
@RequestMapping("/api/ciclo")
public class CicloController {

	@Autowired
	private CicloService cicloService;

	@PostMapping
	public ResponseEntity<Ciclo> salvarCiclo(@RequestBody Ciclo ciclo) {
		return ResponseEntity.ok(cicloService.salvarCiclo(ciclo));
	}
}
