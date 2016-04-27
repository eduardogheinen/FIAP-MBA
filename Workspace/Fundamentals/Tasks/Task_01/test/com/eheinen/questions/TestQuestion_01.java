package com.eheinen.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuestion_01 {

	@Test
	public void testArrayInverted() {
		Question_01 question = new Question_01(5, 3);
		int[] sequentialArray = question.getSequencialArray();
		assertEquals(5, sequentialArray[0]);
		assertEquals(6, sequentialArray[1]);
		assertEquals(7, sequentialArray[2]);
		
		sequentialArray = question.invert();
		assertEquals(7, sequentialArray[0]);
		assertEquals(6, sequentialArray[1]);
		assertEquals(5, sequentialArray[2]);
	}

}
