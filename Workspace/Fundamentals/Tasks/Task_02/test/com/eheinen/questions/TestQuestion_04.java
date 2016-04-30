package com.eheinen.questions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.eheinen.questions.question_04.Question_04;
import com.eheinen.utils.InvalidNumberException;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_04 {

private Question_04 question;
	
	@Before
	public void setup(){
		question = new Question_04();
	}
	
	@Test
	public void testSum() {
		try {
			assertThat(question.sum(7.5f, 7.5f), equalTo(15.0f));
		} catch (InvalidNumberException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testSubtract() {
		try {
			assertThat(question.subtract(7.0f, 5.0f), equalTo(2.0f));
		} catch (InvalidNumberException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testDivide() {
		try {
			assertThat(question.divide(10.0f, 5.0f), equalTo(2.0f));
		} catch (InvalidNumberException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testDivideByZero() {
		try {
			question.divide(7.5f, 0);
		}
		catch(ArithmeticException ex){
			assertThat(ex.getMessage(), equalTo("You cannot divide by zero."));
		} catch (InvalidNumberException e) {
			Assert.fail();
		}
		
	}
	
	@Test
	public void testMultiply() {
		try {
			assertThat(question.multiply(7.0f, 7.0f), equalTo(49.0f));
		} catch (InvalidNumberException e) {
			Assert.fail();
		}
	}
	
	@Test
	public void testSumFirstOperatorZero() {
		try {
			question.sum(0, 10);
		}
		catch(InvalidNumberException ex){
			assertThat(ex.getMessage(), equalTo("You typed zero in the first operator!"));
		}
	}
	
	@Test
	public void testSubtractFirstOperatorZero() {
		try {
			question.subtract(0, 10);
		}
		catch(InvalidNumberException ex){
			assertThat(ex.getMessage(), equalTo("You typed zero in the first operator!"));
		}
	}
	
	@Test
	public void testDivideFirstOperatorZero() {
		try {
			question.divide(0, 10);
		}
		catch(InvalidNumberException ex){
			assertThat(ex.getMessage(), equalTo("You typed zero in the first operator!"));
		}
	}
	
	@Test
	public void testMultiplyFirstOperatorZero() {
		try {
			question.multiply(0, 10);
		}
		catch(InvalidNumberException ex){
			assertThat(ex.getMessage(), equalTo("You typed zero in the first operator!"));
		}
	}
}
