package com.smartgreenhouse.alphagrow.file.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.smartgreenhouse.alphagrow.models.Atuador;

public class AtuadorWriter {

	public static void escreverAtuador(Atuador atuador) {
		File arquivo = new File("arquivo.txt");
		try (FileWriter fileWriter = new FileWriter(arquivo)) {
			fileWriter.write("Testando escrever arquivo");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
