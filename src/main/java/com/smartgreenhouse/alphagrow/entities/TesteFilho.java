package com.smartgreenhouse.alphagrow.entities;

public class TesteFilho {

	private String nome;
	
	public TesteFilho() {
	}

	public TesteFilho(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "TesteFilho [nome=" + nome + "]";
	}

}
