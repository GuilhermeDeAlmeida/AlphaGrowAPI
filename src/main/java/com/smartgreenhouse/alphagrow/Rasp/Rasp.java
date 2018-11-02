package com.smartgreenhouse.alphagrow.Rasp;

import org.springframework.data.annotation.Id;

import com.smartgreenhouse.alphagrow.models.Cultivo;

public class Rasp {

	@Id
	private String id;
	private Cultivo cultivo;
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Cultivo getCultivo() {
		return cultivo;
	}
	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	
}
