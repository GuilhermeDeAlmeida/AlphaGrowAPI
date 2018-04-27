package com.smartgreenhouse.alphagrow.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Teste {

	@Id
	private String id;
	private String nome;
	private List<TesteFilho>	testeFilho;
	
	public Teste() {
	}

	public Teste(String nome, List<TesteFilho> testeFilho) {
		this.testeFilho = testeFilho;
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

	public List<TesteFilho> getTesteFilho() {
		return testeFilho;
	}

	public void setTesteFilho(List<TesteFilho> testeFilho) {
		this.testeFilho = testeFilho;
	}
	
	@Override
	public String toString() {
		String filhos = "";
		
		for (TesteFilho tf : testeFilho) {
			filhos += tf.toString() + "\n";
		}
		
		return "Teste ["+ 
				"\nid=" + id + ","+ 
				"\nnome=" + nome + 
				"\nTeste Filho:[" + 
					"\n\t" + filhos +
					"\n ]"+
				"]";
	}
}
