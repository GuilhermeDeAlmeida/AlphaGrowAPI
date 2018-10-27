package com.smartgreenhouse.alphagrow.controllers;

import java.util.List;

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
import com.smartgreenhouse.alphagrow.services.CultivoService;

@RestController
@RequestMapping("/api/cultivo")
public class CultivoController {
	
	@Autowired
	private CultivoService cultivoService;
	
	//Android vai acessar essa URL
	//mandando o cultivo pela qual pretende saber o status do cultivo
	@GetMapping("/obterCultivo{id}")
	public ResponseEntity<Cultivo> obterCultivo(@PathVariable(value="id") String id, @RequestParam("idCultivo")String idCultivo){
		return ResponseEntity.ok(cultivoService.buscarCultivo(idCultivo));
	}
	
	@GetMapping("/cultivos")
	public ResponseEntity<List<Cultivo>> obterCultivos(){
		return ResponseEntity.ok(cultivoService.obterCultivos());
	}
	
	@PostMapping("/cultivos")
	public ResponseEntity<Cultivo> salvarCultivo(@RequestBody Cultivo cultivo){
		return ResponseEntity.ok(cultivoService.salvarCultivo(cultivo));
	}

}
