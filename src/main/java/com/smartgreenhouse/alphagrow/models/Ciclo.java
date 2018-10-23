package com.smartgreenhouse.alphagrow.models;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ciclo {
	
	private String id;
	private String nome;
	private Integer duracao;
	private Date dataInicio;
	private Date dataFim;
	private List<Controlador> controladoresAtual;
	private ControladorRasp controladoresIdeal;
	private boolean cicloAtual;
	
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
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public List<Controlador> getControladoresAtual() {
		return controladoresAtual;
	}
	public void setControladoresAtual(List<Controlador> controladoresAtual) {
		this.controladoresAtual = controladoresAtual;
	}
	public ControladorRasp getControladoresIdeal() {
		return controladoresIdeal;
	}
	public void setControladoresIdeal(ControladorRasp controladoresIdeal) {
		this.controladoresIdeal = controladoresIdeal;
	}
	public boolean getCicloAtual() {
		return cicloAtual;
	}
	public void setCicloAtual(boolean cicloAtual) {
		this.cicloAtual = cicloAtual;
	}
	
	
}
