package com.eheinen.questions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_03 {

	@Test
	public void testSalaryAverage() {
		Question_03 question = new Question_03();
		double[] salaryArray = new double[]{
			4750.00d, 2700.00d, 3000.00d
		};
		double average = question.salaryAverage(3, salaryArray);
		System.out.println(average);
		assertThat(average, equalTo(3483.3333333333335d));
	}

}
