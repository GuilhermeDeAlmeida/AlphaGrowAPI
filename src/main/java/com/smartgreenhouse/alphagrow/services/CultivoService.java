package com.smartgreenhouse.alphagrow.services;

import java.util.List;

import com.smartgreenhouse.alphagrow.models.Cultivo;

public interface CultivoService {
	
	Cultivo buscarCultivo(String id);
	Cultivo cadastrarCultivo(Cultivo cultivo);
	List<Cultivo> consultarPropriedades();
	Cultivo salvarCultivo(Cultivo cultivo);
	List<Cultivo> obterCultivos();

}
