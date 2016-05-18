package com.eheinen.questions.question_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Thread_01 extends Thread {

	@Override
	public synchronized void run(){
		setName("Thread Message");
		List<String> messages = getMessages();
		int i = 0;
		while (i < messages.size()){
			try {
				System.out.println(messages.get(i++));
				sleep(20000);
			} catch (InterruptedException | NullPointerException e) {
				e.printStackTrace();
			}
		}
		interrupt();
	}
	
	public List<String> getMessages(){
		try {
			BufferedReader br = Files.newBufferedReader(Paths.get("src/resources/messages.txt"),  
					StandardCharsets.ISO_8859_1);
			return br.lines().collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
