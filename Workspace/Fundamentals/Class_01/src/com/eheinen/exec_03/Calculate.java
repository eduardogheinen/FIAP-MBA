package com.eheinen.exec_03;

import java.util.Random;

/**
 * 
 * Calcule o máximo, o mínimo, a soma e a média de um Array de inteiros 
 * aleatórios (ex: {3, 5, 1, 9}).
 * 
 * @author Eduardo Heinen
 */
public class Calculate {

	private Integer[] randomArray = new Integer[10];
	
	public Calculate(){
		for(int i=0; i<10; i++){
			Random rn = new Random();
			randomArray[i] = rn.nextInt(10000);
		}
	}
	
	public int getMax(){
		int biggest = 0;
		for (Integer num : randomArray) {
			if(num > biggest)
				biggest = num;
		}
		return biggest;
	}
	
	public int getMin(){
		int lowest = randomArray[0];
		for (Integer num : randomArray) {
			if(num < lowest)
				lowest = num;
		}
		return lowest;
	}
	
	public int getSum(){
		int total = 0;
		for (Integer num : randomArray) {
			total += num;
		}
		return total;
	}
	
	public int getAverage(){
		return this.getSum() / randomArray.length;
	}
	
	public String toString(){
		String arrayNumbers = "";
		for (Integer num : randomArray) {
			arrayNumbers += " - " + num;
		}
		return arrayNumbers;
	}
}
