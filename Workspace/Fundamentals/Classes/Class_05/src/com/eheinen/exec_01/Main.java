package com.eheinen.exec_01;

public class Main {

	public static void main(String[] args){
		new Thread(new Horse("John")).start();
		new Thread(new Horse("Iguels")).start();
		new Thread(new Horse("Noiat")).start();
		new Thread(new Horse("Floian")).start();
		new Thread(new Horse("Sorpit")).start();
	}
	
}
