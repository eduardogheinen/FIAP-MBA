package com.eheinen.questions;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um sistema baseado em criptografia que tem o objetivo de codificar
 * e decodificar um arquivo texto. A regra de codificação é incrementar o código
 * ASCII de cada caractere, de forma que o código 1, representado pela letra A
 * seria alterado para 2 (1+2), representado pela letra B e assim por diante. O
 * sistema deve funcionar da seguinte forma: 
 * 
 * 1) solicitar uma mensagem ao usuário a ser codificada; 
 * 2) codificar e salvar o arquivo “mensagemCodificada.txt” e por fim 
 * 3) salvar o arquivo decodificado no arquivo “mesagemDecodificada.txt”.
 * Utilize o StringBuilder para alterar os valores caractere a caractere, utilizando o
 * método setChar(int, char).
 * 
 * @author Eduardo Heinen
 */

public class Question_05 {

	public void encode() throws UnsupportedEncodingException, FileNotFoundException, IOException{
		StringBuilder textEncode;
		textEncode = new StringBuilder(JOptionPane.showInputDialog("Insert your message:"));
		
		for(int i=0; i<textEncode.length(); i++){
			textEncode.setCharAt(i, (char) (textEncode.charAt(i) + 1));
		}
		this.writeFile(textEncode, "EncodedMessage");
	}
	
	public void decode() throws IOException{
		StringBuilder textDecode = new StringBuilder(new String(Files.readAllBytes(Paths.get("C:\\Temp\\EncodedMessage.txt"))));
		for(int i=0; i<textDecode.length(); i++){
			textDecode.setCharAt(i, (char) (textDecode.charAt(i) - 1));
		}		
		this.writeFile(textDecode, "DecodedMessage");
	}
	
	private void writeFile(StringBuilder text, String fileName) throws UnsupportedEncodingException, FileNotFoundException, IOException{
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("C:\\Temp\\" + fileName + ".txt"), "utf-8"))
		){
			writer.write(text.toString());
		}
	}
	
}
