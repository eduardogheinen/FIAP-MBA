package com.eheinen.exec_02;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		try {
			Path source = Paths.get("c:\\Temp\\Source");
			Path target = Paths.get("c:\\Temp\\Target");
			Files.walkFileTree(source, new FileReader(target));

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
