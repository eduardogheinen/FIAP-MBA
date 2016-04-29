package com.eheinen.questions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import com.eheinen.utils.WrongOptionException;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_04 {

	@Test
	public void testCalculator() {
		Question_04 question = new Question_04();
		
		try{
			assertThat(question.calculate("+", 5, 5), equalTo(10));
			assertThat(question.calculate("-", 5, 5), equalTo(0));
			assertThat(question.calculate("*", 5, 5), equalTo(25));
			assertThat(question.calculate("/", 5, 5), equalTo(1));
			
			assertThat(question.calculate("+", 5.5, 5.5), equalTo(11.0));
			assertThat(question.calculate("-", 5.5, 4.5), equalTo(1.0));
			assertThat(question.calculate("*", 5.5, 5.5), equalTo(30.25));
			assertThat(question.calculate("/", 5.5, 4.5), equalTo(1.2222222222222223));
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	@Test
    public void testDivideIntegerByZero() {
		Question_04 question = new Question_04();
		try {
			question.calculate("/", 5, 0);
		}
		catch(ArithmeticException | WrongOptionException ex){
			System.out.println(ex.getMessage());
		}
    }
	
	@Test
    public void testDivideDoubleByZero() {
		Question_04 question = new Question_04();
		try {
			question.calculate("/", 5.0, 0);
		}
		catch(ArithmeticException | WrongOptionException ex){
			assertThat(ex.getMessage(), equalTo("You cannot divide by zero!"));
		}
    }
	
	@Test
    public void testSettingInIntWrongOperator() {
		Question_04 question = new Question_04();
		try {
			question.calculate("=", 5, 0);
		}
		catch(ArithmeticException | WrongOptionException ex){
			assertThat(ex.getMessage(), equalTo("You need to type a valid operator like: +  -  *  /"));
		}
    }
	
	@Test
    public void testSettingInDoubleWrongOperator() {
		Question_04 question = new Question_04();
		try {
			question.calculate("=", 5.0, 0);
		}
		catch(ArithmeticException | WrongOptionException ex){
			assertThat(ex.getMessage(), equalTo("You need to type a valid operator like: +  -  *  /"));
		}
    }
}
