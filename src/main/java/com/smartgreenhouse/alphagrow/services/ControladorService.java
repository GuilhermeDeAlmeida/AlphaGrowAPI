 package com.smartgreenhouse.alphagrow.services;

import java.util.List;

import com.smartgreenhouse.alphagrow.models.Controlador;

public interface ControladorService {
	List<Controlador> consultarControladores();
	Controlador salvarControlador(Controlador controlador);
	
}
