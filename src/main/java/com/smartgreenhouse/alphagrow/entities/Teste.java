package com.smartgreenhouse.alphagrow.entities;

import org.springframework.data.annotation.Id;

public class Teste {

	@Id
	public String id;
	public String nome;
	
	public Teste() {
	}

	public Teste(String nome) {
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Teste [id=" + id + ", nome=" + nome + "]";
	}
	
}
