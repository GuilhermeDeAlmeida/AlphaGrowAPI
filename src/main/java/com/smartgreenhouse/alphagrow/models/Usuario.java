package com.smartgreenhouse.alphagrow.models;

import org.springframework.data.annotation.Id;

import com.smartgreenhouse.alphagrow.Rasp.Rasp;

public class Usuario {

	@Id
	private String id;
	private String nome;
	private Rasp rasp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Rasp getRasp() {
		return rasp;
	}

	public void setRasp(Rasp rasp) {
		this.rasp = rasp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
