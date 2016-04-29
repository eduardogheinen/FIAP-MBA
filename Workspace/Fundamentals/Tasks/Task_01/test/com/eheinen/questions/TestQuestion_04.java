package com.eheinen.questions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TestQuestion_04 {

	@Test
	public void testCalculator() {
		Question_04 question = new Question_04();
		assertThat(question.sum(5, 5), equalTo(10));
		assertThat(question.subtract(5, 5), equalTo(0));
		assertThat(question.multiply(5, 5), equalTo(25));
		assertThat(question.divide(5, 5), equalTo(1));
		
		assertThat(question.sum(5.5, 5.5), equalTo(11.0));
		assertThat(question.subtract(5.5, 4.5), equalTo(1.0));
		assertThat(question.multiply(5.5, 5.5), equalTo(30.25));
		assertThat(question.divide(5.5, 4.5), equalTo(1.2222222222222223));
		
	}
	
	@Test
    public void testDivideIntegerByZero() {
		Question_04 question = new Question_04();
		try {
			question.divide(5, 0);
		}
		catch(ArithmeticException ex){
			assertThat(ex.getMessage(), equalTo("You cannot divide by zero!"));
		} 
    }
	
	@Test
    public void testDivideDoubleByZero() {
		Question_04 question = new Question_04();
		try {
			question.divide(5.0, 0);
		}
		catch(ArithmeticException ex){
			assertThat(ex.getMessage(), equalTo("You cannot divide by zero!"));
		} 
    }
}
