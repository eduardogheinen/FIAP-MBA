package com.eheinen.main;

import com.eheinen.questions.Question_01;
import com.eheinen.questions.Question_03;
import com.eheinen.questions.Question_04;
import com.eheinen.questions.Question_05;
import com.eheinen.utils.WrongOptionException;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class Main {

	public static void main(String[] args) {
		// Task 1:
		Question_01 question_01 = new Question_01(5, 10);
		question_01.invert();
		
		
		// Task 2:
		// a = 3
		// b = 2
		// c = 2
		
		
		// Task 3:
		Question_03 question_03 = new Question_03();
		question_03.salaryAverage();
		
		
		// Task 4:
		Question_04 question_04 = new Question_04();
		try{
			System.out.println(question_04.calculate("+", 5, 5));
			System.out.println(question_04.calculate("-", 5, 5));
			System.out.println(question_04.calculate("*", 5, 5));
			System.out.println(question_04.calculate("/", 5, 5));
			
			System.out.println(question_04.calculate("+", 5.5, 5.5));
			System.out.println(question_04.calculate("-", 5.5, 4.5));
			System.out.println(question_04.calculate("*", 5.5, 55.5));
			System.out.println(question_04.calculate("/", 56.4, 5.43));	
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.println(question_04.calculate("/", 5, 0));
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.println(question_04.calculate("=", 5, 5));
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.println(question_04.calculate("/", 5.0, 0));
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
		
		try{
			System.out.println(question_04.calculate("=", 5.5, 5));
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
			
		
		// Task 5:
		// I used BigInteger because after 32! there is 32bit overflow.
		Question_05 question = new Question_05();
		question.calcFactorial();

	}
}
