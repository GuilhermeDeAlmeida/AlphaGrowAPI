package com.smartgreenhouse.alphagrow.services;

import java.util.List;

import com.smartgreenhouse.alphagrow.models.Atuador;

public interface AtuadorService {

	List<Atuador> obterListaAtuadores(String token);

	Boolean salvarAtuador(Atuador atuador);
}
