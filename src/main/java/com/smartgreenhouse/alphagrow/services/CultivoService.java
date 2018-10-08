package com.smartgreenhouse.alphagrow.services;

import com.smartgreenhouse.alphagrow.models.Cultivo;

public interface CultivoService {

	
	Cultivo obterCultivo(String id);
	
	Cultivo salvarCultivo(Cultivo cultivo);
}
