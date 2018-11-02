package com.smartgreenhouse.alphagrow.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgreenhouse.alphagrow.Rasp.Rasp;
import com.smartgreenhouse.alphagrow.models.Ciclo;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;
import com.smartgreenhouse.alphagrow.models.Cultivo;
import com.smartgreenhouse.alphagrow.models.Login;
import com.smartgreenhouse.alphagrow.models.Usuario;
import com.smartgreenhouse.alphagrow.service.RaspService;
import com.smartgreenhouse.alphagrow.service.UsuarioService;
import com.smartgreenhouse.alphagrow.services.CicloService;
import com.smartgreenhouse.alphagrow.services.CultivoService;
import com.smartgreenhouse.alphagrow.services.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CicloService cicloService;
	
	@Autowired
	private CultivoService cultivoService;
	
	@Autowired
	private RaspService raspService;
	
	@Autowired
	private UsuarioService usuarioService;

	
	
	@PostMapping("/cadastrarTeste")
	public ResponseEntity<Login> cadastrarUsuario() {
		Login login = obterContaGenerica();

		return ResponseEntity.ok(loginService.salvarConta(login));
	}

	private Login obterContaGenerica() {
		Login login = new Login();
		login.setEmail("guilhermeaf11@hotmail.com");
		login.setSenha("guilherme123456");
		Usuario usuario = obterUsuarioGenerico();
		login.setUsuario(usuario);
		login = loginService.salvarConta(login);

		return login;

	}

	private Usuario obterUsuarioGenerico() {
		Usuario usuario = new Usuario();
		usuario.setNome("Guilherme");
		Rasp rasp = obterRaspGenerico();
		usuario.setRasp(rasp);
		usuario = usuarioService.salvarUsuario(usuario);
		return usuario;
	}

	private Rasp obterRaspGenerico() {
		Rasp rasp = new Rasp();
		Cultivo cultivo = obterCultivoGenerico();
		rasp.setCultivo(cultivo);
		rasp.setToken("RASPBERRYADRIANO");
		rasp = raspService.salvarRasp(rasp);

		return rasp;
	}

	private Cultivo obterCultivoGenerico() {
		Cultivo cultivo = new Cultivo();
		cultivo.setNomeCultivo("Feijão");
		List<Ciclo> ciclos = obterCiclosGenericos();
		cultivo.setCiclos(ciclos);
		cultivo = cultivoService.salvarCultivo(cultivo);
		return cultivo;
	}

	private List<Ciclo> obterCiclosGenericos() {
		List<Ciclo> ciclos = new ArrayList<>();

		Ciclo ciclo = new Ciclo();
		ControladorRasp controladoresIdeais = new ControladorRasp();

		ciclo.setControladoresIdeal(controladoresIdeais);
		ciclo.setNome("Germinação");
		controladoresIdeais.setTemperatura("28");
		controladoresIdeais.setUmidade("50");
		ciclo.setDuracao(10);
		ciclo.setCicloAtual(true);
		ciclo = cicloService.salvarCiclo(ciclo);
		ciclos.add(ciclo);

		ciclo = new Ciclo();
		controladoresIdeais = new ControladorRasp();
		ciclo.setNome("Floração");
		ciclo.setDuracao(10);
		controladoresIdeais.setTemperatura("26");
		controladoresIdeais.setUmidade("20");
		ciclo.setControladoresIdeal(controladoresIdeais);
		ciclo = cicloService.salvarCiclo(ciclo);
		ciclos.add(ciclo);

		ciclo = new Ciclo();
		controladoresIdeais = new ControladorRasp();
		ciclo.setNome("Frutificação");
		ciclo.setDuracao(10);
		controladoresIdeais.setTemperatura("28");
		controladoresIdeais.setUmidade("18");
		ciclo.setControladoresIdeal(controladoresIdeais);
		ciclo = cicloService.salvarCiclo(ciclo);
		ciclos.add(ciclo);
		
		return ciclos;
	}

}
