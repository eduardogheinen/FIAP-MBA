package com.eheinen.questions.question_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Thread_02 extends Thread {

	@Override
	public synchronized void run(){
		setName("Thread Get Date");
		while (isAlive()){
			try {
				System.out.println(getDate());
				sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getDate(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");
		return LocalDateTime.now().format(formatter);
	}
	
}
