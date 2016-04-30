package com.eheinen.main;

import javax.swing.JOptionPane;

import com.eheinen.questions.question_01.Question_01;
import com.eheinen.questions.question_04.Question_04;
import com.eheinen.utils.MyUtils;
import com.eheinen.utils.InvalidNumberException;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class Main {

	private static MyUtils utils = new MyUtils();
	private final static String MSG_01 = "Type the first number:";
	private final static String MSG_02 = "Type the second number:";
	
	public static void main(String[] args) {
		
		// Task 1:
		Question_01 question_01 = new Question_01();
		try {
			System.out.println(question_01.sum(utils.getNum(MSG_01), utils.getNum(MSG_02)));
			System.out.println(question_01.subtract(utils.getNum(MSG_01), utils.getNum(MSG_02)));
			System.out.println(question_01.multiply(utils.getNum(MSG_01), utils.getNum(MSG_02)));
		
			float result = question_01.divide(utils.getNum(MSG_01), utils.getNum(MSG_02));
			System.out.println(result);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		catch(NullPointerException ex){
			System.out.println("You clicked on cancel");
		}
		
		
		// Task 2:
		// a. objeto para equipamento (objeto=equipamento;);
		// IMPLICIT CONVERSION
		
		// b. objeto para móvel (objeto=movel;);
		// IMPLICIT CONVERSION
		
		// c. equipamento para tablet2 (equipamento=tablet2;);
		// IMPLICIT CONVERSION
		
		// d. equipamento para smartphone2 (equipamento=smartphone2;);
		// IMPLICIT CONVERSION
		
		// e. smartphone para tablet (smartphone=tablet;);
		// IMPLICIT CONVERSION
		
		// f. smartphone2 para tablet2 (smartphone2=tablet2;);
		// COMPILATION ERROR
		
		// g. equipamento para tablet (equipamento=(Equipamento) tablet;);
		// EXPLICIT CONVERSION
		
		// h. movel para tablet (movel=(Movel) tablet;);
		// EXPLICIT CONVERSION
		
		// i. tablet para equipamento (tablet=(EquipamentoEletronico) equipamento;); 
		// EXPLICIT CONVERSION
		
		
		// Task 3:
		// A:
		// Answer: Verdadeiro ou Falso: true
		// Reason: Chow-chow class is an instance of Cachorro class, because Chow-chow extends Cachorro.
		
		// B:
		// Answer: Verdadeiro ou Falso: false
		// Reason: Cachorro class is "father" of Chow-chow class, So that, Cachorro cannot be a instance of its "children" classes.
		
		
		// Task 4:
		Question_04 question_04 = new Question_04();
		try {
			System.out.println(question_04.sum(5, 5));
			System.out.println(question_04.subtract(5, 5));
			System.out.println(question_04.multiply(5, 5));
			System.out.println(question_04.divide(5, 5));
			System.out.println(question_04.divide(5, 0));
		}
		catch(ArithmeticException | InvalidNumberException ex){
			System.out.println(ex.getMessage());
		}
		
		try {
			System.out.println(question_04.sum(0, 5));
		}
		catch(ArithmeticException | InvalidNumberException ex){
			System.out.println(ex.getMessage());
		}
		
		try {
			System.out.println(question_04.subtract(0, 5));
		}
		catch(ArithmeticException | InvalidNumberException ex){
			System.out.println(ex.getMessage());
		}
		
		try {
			System.out.println(question_04.divide(0, 5));
		}
		catch(ArithmeticException | InvalidNumberException ex){
			System.out.println(ex.getMessage());
		}
		
		try {
			System.out.println(question_04.multiply(0, 5));
		}
		catch(ArithmeticException | InvalidNumberException ex){
			System.out.println(ex.getMessage());
		}
				
		
	}
	
	
}
