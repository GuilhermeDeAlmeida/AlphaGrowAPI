package com.smartgreenhouse.alphagrow.entities;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
	private String id;
	private String username;
	private String email;
	private String password;
	private Teste teste;
	
	public Usuario(Teste teste, String username, String email, String password) {
		this.teste = teste;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Usuario() {
	}

	public Teste getTeste() {
		return teste;
	}

	public void setTeste(Teste teste) {
		this.teste = teste;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
