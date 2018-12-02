package com.smartgreenhouse.alphagrow.file.writer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartgreenhouse.alphagrow.models.Atuador;

public class AtuadorWriter {

	public static final String ABSOLUT_PATH = obterCaminhoAbsoluto();
	
	public static Boolean escreverAtuador(Atuador atuador) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			escreverArquivo(mapper, atuador);
			return true;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	private static void escreverArquivo(ObjectMapper mapper, Atuador atuador) throws IOException {
		Path path = Paths.get(obterCaminhoDaPasta(atuador.getToken()));
		if(!Files.exists(path)) {
			Files.createDirectories(path);
		}
		mapper.writeValue(new File(obterCaminhoCompletoDoAtuador(atuador)), atuador);
	}

	private static String obterCaminhoCompletoDoAtuador(Atuador atuador) {
		StringBuilder builder = new StringBuilder(obterCaminhoDaPasta(atuador.getToken()));
		builder.append("\\");
		builder.append(atuador.getAtuador());
		builder.append(".json");

		return builder.toString();
	}

	private static String obterCaminhoDaPasta(String token) {
		StringBuilder builder = new StringBuilder(ABSOLUT_PATH);
		builder.append("\\");
		builder.append(token);
		return builder.toString();
	}

	private static String obterCaminhoAbsoluto() {
		return System.getProperty("user.dir").replace("jars", "");
	}

	public static List<Atuador> obterAtuadores(String token) {
		return obterListaDeAtuadores(new File(obterCaminhoDaPasta(token)));
	}
	
	public static List<Atuador> obterListaDeAtuadores(final File pasta) {
		List<Atuador> atuadores = new ArrayList<Atuador>();
		for (final File arquivo : pasta.listFiles()) {
			try {
				atuadores.add(converterFileEmAtuador(arquivo));
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	    }
		return atuadores;
	}

	private static Atuador converterFileEmAtuador(File arquivo) throws JsonParseException, JsonMappingException, IOException {
		return new ObjectMapper().readValue(arquivo, Atuador.class);
	}
}
