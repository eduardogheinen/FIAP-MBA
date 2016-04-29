package com.eheinen.main;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.eheinen.questions.Question_01;
import com.eheinen.questions.Question_03;
import com.eheinen.questions.Question_04;
import com.eheinen.questions.Question_05;

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
		assertThat(question_04.sum(5, 5), equalTo(10));
		assertThat(question_04.subtract(5, 5), equalTo(0));
		assertThat(question_04.multiply(5, 5), equalTo(25));
		assertThat(question_04.divide(5, 5), equalTo(1));
		
		assertThat(question_04.sum(5.5, 5.5), equalTo(11.0));
		assertThat(question_04.subtract(5.5, 4.5), equalTo(1.0));
		assertThat(question_04.multiply(5.5, 5.5), equalTo(30.25));
		assertThat(question_04.divide(5.5, 4.5), equalTo(1.2222222222222223));
		
		try {
			question_04.divide(5, 0);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		} 
		
		try {
			question_04.divide(5.0, 0);
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		
		
		// Task 5:
		// I used BigInteger because after 32! there is 32bit overflow.
		Question_05 question = new Question_05();
		question.calcFactorial();

	}

}
