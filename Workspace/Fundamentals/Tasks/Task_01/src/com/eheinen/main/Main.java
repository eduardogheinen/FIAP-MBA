package com.eheinen.main;

import com.eheinen.questions.Question_01;
import com.eheinen.questions.Question_03;
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
		
		// Task 5:
		// I used BigInteger because after 32! there is 32bit overflow.
		//Question_05 question = new Question_05();
		//question.calcFactorial();
	}

}
