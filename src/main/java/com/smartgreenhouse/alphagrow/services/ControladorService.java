 package com.smartgreenhouse.alphagrow.services;

import java.util.List;

import com.smartgreenhouse.alphagrow.models.Controlador;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;

public interface ControladorService {
	List<Controlador> consultarControladores();
	Controlador salvarControlador(Controlador controlador);
	ControladorRasp salvarControladorRasp(ControladorRasp controladorRasp);
	
}
