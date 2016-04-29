package com.eheinen.questions;

import com.eheinen.utils.MyUtils;
import com.eheinen.utils.OperatorEnum;
import com.eheinen.utils.WrongOptionException;

/**
 * Construa um programa que funcione como uma calculadora. Este programa
 * devera conter as operacoes soma, divisao, multiplicacao e subtracao. Os
 * operadores deverao ser informados via parametros nos metodos. O programa
 * devera aceitar realizar operacoes do tipo inteiro (int) e duplo (double).
 * 
 * @author Eduardo Heinen
 */

public class Question_04 {

	private MyUtils utils;
	
	public Question_04(){
		utils = new MyUtils();
	}
	
	public int calculate(String operator, int num1, int num2) throws ArithmeticException, WrongOptionException {
		OperatorEnum oper = utils.getOperator(operator);
		switch(oper){
			case DIVIDE:
				if(num2 == 0)
					throw new ArithmeticException("You cannot divide by zero!");
				return num1 / num2;
			case MINUS:
				return num1 - num2;
			case MULTIPLY:
				return num1 * num2;
			case SUM:
				return num1 + num2;
			default:
				throw new WrongOptionException("You need to type a valid operator like: +  -  *  /");
		}
	}
	
	public double calculate(String operator, double num1, double num2) throws ArithmeticException, WrongOptionException{
		OperatorEnum oper = utils.getOperator(operator);
		switch(oper){
			case DIVIDE:
				if(num2 == 0)
					throw new ArithmeticException("You cannot divide by zero!");
				return num1 / num2;
			case MINUS:
				return num1 - num2;
			case MULTIPLY:
				return num1 * num2;
			case SUM:
				return num1 + num2;
			default:
				throw new WrongOptionException("You need to type a valid operator like: +  -  *  /");
		}
	}
}
