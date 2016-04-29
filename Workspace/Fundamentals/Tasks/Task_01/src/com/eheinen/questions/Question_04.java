package com.eheinen.questions;

/**
 * Construa um programa que funcione como uma calculadora. Este programa
 * devera conter as operacoes soma, divisao, multiplicacao e subtracao. Os
 * operadores deverao ser informados via parametros nos metodos. O programa
 * devera aceitar realizar operacoes do tipo inteiro (int) e duplo (double).
 * 
 * @author Eduardo Heinen
 */

public class Question_04 {

	public Question_04(){

	}
	
	public int sum(int num1, int num2){
		return num1 + num2;
	}
	
	public int subtract(int num1, int num2){
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	public int divide(int num1, int num2){
		if(num2 == 0)
			throw new ArithmeticException("You cannot divide by zero!");
		return num1 / num2;
	}
	
	public double sum(double num1, double num2){
		return num1 + num2;
	}
	
	public double subtract(double num1, double num2){
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2){
		return num1 * num2;
	}
	
	public double divide(double num1, double num2){
		if(num2 == 0)
			throw new ArithmeticException("You cannot divide by zero!");
		return num1 / num2;
	}
}
