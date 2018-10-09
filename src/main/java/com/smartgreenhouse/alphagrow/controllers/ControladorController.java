package com.smartgreenhouse.alphagrow.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.entities.Teste;
import com.smartgreenhouse.alphagrow.entities.TesteFilho;
import com.smartgreenhouse.alphagrow.entities.Usuario;
import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.models.Cultivo;
import com.smartgreenhouse.alphagrow.repositories.UsuarioRepository;
import com.smartgreenhouse.alphagrow.services.ControladorService;
import com.smartgreenhouse.alphagrow.services.CultivoService;

//Defindo que este cara eh um REST
@RestController
//Recursos ficarao disponiveis atraves da URL abaixo
@RequestMapping("/api/controlador/guilherme")
public class ControladorController {
	
	@Autowired
	private ControladorService controladorService;
	
	@Autowired
	private CultivoService cultivoService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Definindo que esse metodo estara acessivel atraves dessa URL, e o que o mesmo sera um GET
	@GetMapping("/teste")
	public ResponseEntity<String> teste(){
		//Armazenando retorno do metodo teste em uma variavel
		String teste = controladorService.teste();
	
		//ResponseEntity sera responsavel pelo formato da resposta
		return ResponseEntity.ok(teste);
	}
	
	@PostMapping("/cadastarConsulta")
	public ResponseEntity<String>  cadastrarConsulta(@RequestBody Controlador consulta){
		
		StringBuilder retorno = new StringBuilder();
		
		retorno.append("A umidade que voce me enviou:\n");
		retorno.append(consulta.getUmidade().toString());
		retorno.append("\n");
	
		retorno.append("A temperatura que voce me enviou:\n");
		retorno.append(consulta.getTemperatura());
		
		
		return ResponseEntity.ok(retorno.toString());
	}
	

	
	@GetMapping("/obter-cultivo")
	public ResponseEntity<Cultivo> obterCultivo(@RequestBody String id){
		return ResponseEntity.ok(cultivoService.obterCultivo(id));	
	}
	
	@GetMapping("/teste-mongodb")
	public ResponseEntity<Usuario> testarMongoDB(){
		
		Usuario usuario = new Usuario();
		
		
		TesteFilho tf1 = new TesteFilho("filho 1");
		TesteFilho tf2 = new TesteFilho("filho 2");
		TesteFilho tf3 = new TesteFilho("filho 3");
		TesteFilho tf4 = new TesteFilho("filho 4");
		
		List<TesteFilho> filhos = new ArrayList<>();
		filhos.add(tf1);
		filhos.add(tf2);
		filhos.add(tf3);
		filhos.add(tf4);
		
		Teste teste = new Teste("Testando TesteFilho", filhos);
		
		usuario.setEmail("guilherme@guilherme.com");
		usuario.setPassword("123456");
		usuario.setUsername("guilherme");
		usuario.setTeste(teste);
				
		usuarioRepository.save(usuario);
		//controladorService.testarMongoDB(teste);
		return ResponseEntity.ok(usuario);
	}
	
	
	
	
}
