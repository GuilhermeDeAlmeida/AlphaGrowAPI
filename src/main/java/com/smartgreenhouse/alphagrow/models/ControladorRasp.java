package com.smartgreenhouse.alphagrow.models;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class ControladorRasp {
	
	@Id
	private String id;
	private String temperatura;
	private String umidade;
	private Date dataRegistro;
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getUmidade() {
		return umidade;
	}
	public void setUmidade(String umidade) {
		this.umidade = umidade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	

}
