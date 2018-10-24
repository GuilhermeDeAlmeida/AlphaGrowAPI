package com.smartgreenhouse.alphagrow.models;

import com.smartgreenhouse.alphagrow.entities.Usuario;

public class Login {

	private Usuario usuario;
	private String email;
	private String senha;
	private String idCultivo; 
	
	public String getIdCultivo() {
		return idCultivo;
	}
	public void setIdCultivo(String idCultivo) {
		this.idCultivo = idCultivo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
