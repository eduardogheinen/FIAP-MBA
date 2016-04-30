package com.eheinen.questions.question_01;

import com.eheinen.utils.MyUtils;

/**
 * Crie uma classe que terá o comportamento de uma calculadora. Essa classe 
 * deverá ter a interface CalculadoraBasica a seguir. Depois de desenvolver a 
 * classe, teste o seu funcionamento, verificando todos os métodos da interface. 
 * Utilize a saída em console para informar o resultado e o
 * JOptionPane.showInputDialog para a entrada de dados do usuário. 
 * 
 * @author Eduardo Heinen
 */

public class Question_01 implements BasicCalculator {

	private MyUtils utils;
	
	public Question_01(){
		utils = new MyUtils();
	}

	@Override
	public float sum(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	@Override
	public float divide(float num1, float num2) {
		if(num2 == 0)
			throw new ArithmeticException("You cannot divide by zero.");
		return num1 / num2;
	}

	@Override
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
	
}
