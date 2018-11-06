package com.smartgreenhouse.alphagrow.file.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.smartgreenhouse.alphagrow.models.Atuador;

public class AtuadorWriter {

	public static void escreverAtuador(Atuador atuador) {
		
		String nomePath = System.getProperty("user.dir").replace("jars", "") + "\\" + atuador.getToken();
		String nomeArquivo =  "\\" + atuador.getAtuador() + ".txt";
		System.out.println(System.getProperty("user.dir").replace("jars", ""));
		File path = new File(nomePath);
		File arquivo = new File(path,nomeArquivo);
		System.out.println(arquivo.getAbsolutePath());
		try (FileWriter fileWriter = new FileWriter(arquivo)) {
			fileWriter.write(registrarEstadoAtuador(atuador));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String registrarEstadoAtuador(Atuador atuador) {
		Gson json = new Gson();
		String registro = json.toJson(atuador);
		return registro;
	}
}
