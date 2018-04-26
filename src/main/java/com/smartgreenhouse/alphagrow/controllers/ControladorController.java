package com.smartgreenhouse.alphagrow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.entities.Teste;
import com.smartgreenhouse.alphagrow.enums.TipoControlador;
import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.services.ControladorService;

//Defindo que este cara eh um REST
@RestController
//Recursos ficarao disponiveis atraves da URL abaixo
@RequestMapping("/api/controlador")
public class ControladorController {
	
	//Injecao do servico dos controladores
	@Autowired
	private ControladorService controladorService;
	
	//Definindo que esse metodo estara acessivel atraves dessa URL, e o que o mesmo sera um GET
	@GetMapping("/teste")
	public ResponseEntity<String> teste(){
		//Armazenando retorno do metodo teste em uma variavel
		String teste = controladorService.teste();
	
		//ResponseEntity sera responsavel pelo formato da resposta
		return ResponseEntity.ok(teste);
	}
	
	@GetMapping("/status-controladores")
	public ResponseEntity<Controlador> consultarControladores(){
	
		Controlador controlador = new Controlador();
		
		controlador.setHumidade("25%");
		controlador.setLuminosidade("70");
		controlador.setPh("3%");
		controlador.setTemperatura("19o");
		
		return ResponseEntity.ok(controlador);
	}
	
	@GetMapping("/status-controlador/{tipo}")
	public ResponseEntity<Controlador> consultarControlador(@PathVariable("tipo") String tipo){
	
		TipoControlador tipoControlador = TipoControlador.valueOf(tipo);
		
		Controlador controlador = controladorService.consultarControlador(tipoControlador);
		
		return ResponseEntity.ok(controlador);
	}
	
	@PostMapping("/teste-mongodb")
	public ResponseEntity<Teste> testarMongoDB(){
		Teste teste = new Teste("Guilherme testando outra vez");
		teste.setId("5ae0ca83a82da630eca118cd");
		controladorService.testarMongoDB(teste);
		return ResponseEntity.ok(teste);
	}
	
	
	
	
}
