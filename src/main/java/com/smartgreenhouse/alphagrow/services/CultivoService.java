package com.smartgreenhouse.alphagrow.services;

import com.smartgreenhouse.alphagrow.models.Cultivo;

public interface CultivoService {
	Cultivo buscarCultivo(String id);
	Cultivo cadastrarCultivo(Cultivo cultivo);

}
