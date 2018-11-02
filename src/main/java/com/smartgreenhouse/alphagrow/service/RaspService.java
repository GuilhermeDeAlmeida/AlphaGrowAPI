package com.smartgreenhouse.alphagrow.service;

import com.smartgreenhouse.alphagrow.Rasp.Rasp;
import com.smartgreenhouse.alphagrow.models.ControladorRasp;

public interface RaspService {

	Rasp salvarRasp(Rasp rasp);

	ControladorRasp obterControladoresIdeais(String token);

}
