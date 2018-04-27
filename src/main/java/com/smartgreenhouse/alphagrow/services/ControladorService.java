 package com.smartgreenhouse.alphagrow.services;

import com.smartgreenhouse.alphagrow.entities.Teste;
import com.smartgreenhouse.alphagrow.enums.TipoControlador;
import com.smartgreenhouse.alphagrow.models.Controlador;

public interface ControladorService {

	String teste();
	Controlador consultarControladores();
	Controlador consultarControlador(TipoControlador tipoControlador);
	Teste testarMongoDB(Teste teste);
	
}