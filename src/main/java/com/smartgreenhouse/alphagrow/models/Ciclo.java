package com.smartgreenhouse.alphagrow.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Ciclo {

	@Id
	private String id;
	private String nome;
	private Integer duracao;
	private Date dataInicio;
	private Date dataFim;
	// Será reflexo do que o rasp salvar na base
	private List<Controlador> controladoresAtual;
	// Pre cadastrados as medidas ideiais dos controladores
	private ControladorRasp controladoresIdeal;
	private Boolean cicloAtual;
	private Long diaAtual;

	public Ciclo(String id, String nome, Integer duracao, Date dataInicio, Date dataFim,
			List<Controlador> controladoresAtual, ControladorRasp controladoresIdeal, Boolean cicloAtual,
			Long diaAtual) {
		
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.controladoresAtual = controladoresAtual;
		this.controladoresIdeal = controladoresIdeal;
		this.cicloAtual = cicloAtual;
		this.diaAtual = diaAtual;
	}

	public Ciclo() {
		this.nome = "";
		this.duracao = 0;
		this.dataInicio = new Date();
		this.dataFim = new Date();
		this.controladoresAtual = new ArrayList();
		this.controladoresIdeal = new ControladorRasp();
		this.cicloAtual = false;
		this.diaAtual = 0L;
	}

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
