package com.eheinen.questions;

import java.math.BigInteger;

import javax.swing.JOptionPane;

import com.eheinen.utils.MyUtils;

/**
 * Construa um programa que solicite um número e retorne o cálculo de seu 
 * número fatorial. Exemplo do cálculo 5!=5.4.3.2.1.
 * 
 * @author Eduardo Heinen
 */

public class Question_05 {

	private MyUtils utils;
	
	public Question_05(){
		utils = new MyUtils();
	}
	
	private int openInputNumber(){
		boolean isValid = false;
		String inputValue = null;
		while(isValid == false){
			inputValue = JOptionPane.showInputDialog("Please, type a integer number:");
			isValid = utils.isValidInteger(inputValue);
		}
		return Integer.parseInt(inputValue);
	}
	
	public BigInteger calcFactorial(){
		int number = openInputNumber();
		return calcFactorial(number); 
	}
	
	public BigInteger calcFactorial(int number){
		BigInteger total = BigInteger.valueOf(number);
		String factorial = number + "!=" + number;
		
		for(int i=number - 1; i>0; i--){
			factorial += "." + i;
			total = total.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);
		System.out.println("Factorial Total = " + total);
		
		return total; 
	}
}
