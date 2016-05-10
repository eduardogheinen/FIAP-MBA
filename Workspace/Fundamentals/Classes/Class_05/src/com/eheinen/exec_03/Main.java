package com.eheinen.exec_03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		try {
			Files.list(Paths.get("c:\\windows")) 
				.filter(p -> p.toString().endsWith(".exe")) 
				.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
