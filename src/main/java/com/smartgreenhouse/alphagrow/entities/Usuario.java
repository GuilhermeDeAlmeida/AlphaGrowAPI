package com.smartgreenhouse.alphagrow.entities;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
	private String idUser;
	private String nome;
	private String idCultivo;

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdCultivo() {
		return idCultivo;
	}

	public void setIdCultivo(String idCultivo) {
		this.idCultivo = idCultivo;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
	
}
