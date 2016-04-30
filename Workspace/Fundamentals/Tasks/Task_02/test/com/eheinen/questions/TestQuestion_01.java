package com.eheinen.questions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Before;
import org.junit.Test;

import com.eheinen.questions.question_01.Question_01;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_01 {

	private Question_01 question;
	
	@Before
	public void setup(){
		question = new Question_01();
	}
	
	@Test
	public void testSum() {
		assertThat(question.sum(7.5f, 7.5f), equalTo(15.0f));
	}
	
	@Test
	public void testSubtract() {
		assertThat(question.subtract(7.0f, 5.0f), equalTo(2.0f));
	}
	
	@Test
	public void testDivide() {
		assertThat(question.divide(10.0f, 5.0f), equalTo(2.0f));
	}
	
	@Test
	public void testDivideByZero() {
		try {
			question.divide(7.5f, 0);
		}
		catch(ArithmeticException ex){
			assertThat(ex.getMessage(), equalTo("You cannot divide by zero."));
		}
		
	}
	
	@Test
	public void testMultiply() {
		assertThat(question.multiply(7.0f, 7.0f), equalTo(49.0f));
	}

}
