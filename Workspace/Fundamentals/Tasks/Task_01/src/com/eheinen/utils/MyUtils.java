package com.eheinen.utils;

import java.util.Random;

public class MyUtils {

	public int[] buildRandomArray(int amount){
		int[] randomArray = new int[amount];
		for (int i=0; i<randomArray.length; i++) {
			int num = new Random().nextInt(10000);
			randomArray[i] = num;
		}
		return randomArray;
	}
	
	public int[] buildSequencialArray(int number, int amount){
		int[] sequencialArray = new int[amount];
		for (int i=0; i<sequencialArray.length; i++) {
			sequencialArray[i] = number++;
		}
		return sequencialArray;
	}
	
	public void printArray(int[] myArray){
		System.out.println("Start to print:");
		for (int i : myArray) {
			System.out.println(i);
		}
		System.out.println("End to print.\n");
	}
	
	public boolean isValidDouble(String number){
		try {
		    Double.parseDouble(number);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
	
	public boolean isValidInteger(String number){
		try {
		    Integer.parseInt(number);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
}
