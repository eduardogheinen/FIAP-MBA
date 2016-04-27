package com.eheinen.questions;

import static org.hamcrest.Matchers.*;

import java.math.BigInteger;

import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class TestQuestion_05 {

	@Test
	public void testCalcFactorial() {
		Question_05 question = new Question_05();
		BigInteger factorial = question.calcFactorial(5);
		assertThat(factorial.toString(), equalTo("120"));
		
		factorial = question.calcFactorial(10);
		assertThat(factorial.toString(), equalTo("3628800"));
		
		factorial = question.calcFactorial(50);
		assertThat(factorial.toString(), equalTo("30414093201713378043612608166064768844377641568960512000000000000"));
	}

}
