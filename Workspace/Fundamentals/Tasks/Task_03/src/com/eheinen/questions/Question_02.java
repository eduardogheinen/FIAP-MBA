package com.eheinen.questions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

/**
 * Desenvolva um sistema que imprima em tela a data e hora atual nos seguintes
 * formatos, considerando a data 10/09/2012 12:00: 
 * a. 2012-09-10 12:00 
 * b. 10-09-12 12:00:00 
 * c. Monday (dia da semana) 
 * d. 2012 (ano) 
 * e. AD (era) 
 * Utilize apenas formatadores baseado no DateTimeFormatter para cada tipo de formato.
 * 
 * @author Eduardo Heinen
 */

public class Question_02 {

	private LocalDateTime date;

	public Question_02(){
		this.date = LocalDateTime.of(2012, 9, 10, 12, 0);
	}
	
	public Question_02(LocalDateTime date){
		this.date = date;
	}
	
	public Question_02(String date) throws Exception{
		try{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");
			this.date = LocalDateTime.parse(date, formatter);
		}
		catch(DateTimeParseException ex){
			throw new Exception("Invalid Date Format!");
		}
	}

	public String getDateFormatted(DateFormat format) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format.getFormat());
		date.format(formatter).toString();
		return date.format(formatter).toString();
	}
}