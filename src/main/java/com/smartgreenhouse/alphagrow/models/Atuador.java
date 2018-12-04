package com.smartgreenhouse.alphagrow.models;

import org.springframework.data.annotation.Id;

public class Atuador {

	@Id
	private String id;
	private String atuador;
	private boolean estado;
	private String token;
	
	public Atuador(String atuador, boolean estado, String token) {
		super();
		this.atuador = atuador;
		this.estado = estado;
		this.token = token;
	}
	
	public Atuador() {
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getAtuador() {
		return atuador;
	}
	public void setAtuador(String atuador) {
		this.atuador = atuador;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
