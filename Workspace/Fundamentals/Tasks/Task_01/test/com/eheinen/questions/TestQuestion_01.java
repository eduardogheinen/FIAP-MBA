package com.eheinen.questions;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_01 {

	@Test
	public void testArrayInverted() {
		Question_01 question = new Question_01(5, 3);
		int[] sequentialArray = question.getSequencialArray();
		assertThat(sequentialArray[0], equalTo(5));
		assertThat(sequentialArray[1], equalTo(6));
		assertThat(sequentialArray[2], equalTo(7));
		sequentialArray = question.invert();
		assertThat(sequentialArray[0], equalTo(7));
		assertThat(sequentialArray[1], equalTo(6));
		assertThat(sequentialArray[2], equalTo(5));
	}

}
