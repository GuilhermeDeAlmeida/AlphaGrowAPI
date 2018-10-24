package com.smartgreenhouse.alphagrow.models;

import java.util.Date;
import java.util.List;

public class Ciclo {
	
	private String id;
	private String nome;
	private Integer duracao;
	private Date dataInicio;
	private Date dataFim;
	//Será reflexo do que o rasp salvar na base
	private List<Controlador> controladoresAtual;
	//Pre cadastrados as medidas ideiais dos controladores
	private ControladorRasp controladoresIdeal;
	private Boolean cicloAtual;
	private Long diaAtual;
	
	public Long getDiaAtual() {
		return diaAtual;
	}
	public void setDiaAtual(Long diaAtual) {
		this.diaAtual = diaAtual;
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
	public Boolean getCicloAtual() {
		return cicloAtual;
	}
	public void setCicloAtual(Boolean cicloAtual) {
		this.cicloAtual = cicloAtual;
	}
	
	
	
}
