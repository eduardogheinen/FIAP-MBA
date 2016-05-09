package com.eheinen.questions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Eduardo Heinen
 *
 */

public class TestQuestion_02 {

	private Question_02 question;
	private LocalDateTime date;
	
	@Before
	public void setup(){
		question = new Question_02();
		date = LocalDateTime.of(2015, 7, 25, 13, 55, 47);
	}
	
	// Testing with a default date:
	
	@Test
	public void testDefaultDateFormat01() {
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_01), equalTo("2012-09-10 12:00"));
	}
	
	@Test
	public void testDefaultDateFormat02() {
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_02), equalTo("10-09-12 12:00:00"));
	}
	
	@Test
	public void testDefaultDateFormat03() {
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_03), equalTo("Monday"));
	}
	
	@Test
	public void testDefaultDateFormat04() {
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_04), equalTo("2012"));
	}
	
	@Test
	public void testDefaultDateFormat05() {
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_05), equalTo("AD"));
	}
	
	// Testing input a string date:
	
	@Test
	public void testStringDateFormat01() {
		try {
			question = new Question_02("10/09/2012 12:00:00");
			assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_01), equalTo("2012-09-10 12:00"));
		} catch (Exception e) {
			Assert.fail("Inexpected Fail!");
		}
	}
	
	@Test
	public void testStringDateFormat02() {
		try {
			question = new Question_02("10/09/2012 12:00:00");
			assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_02), equalTo("10-09-12 12:00:00"));
		} catch (Exception e) {
			Assert.fail("Inexpected Fail!");
		}
	}
	
	@Test
	public void testStringDateFormat03() {
		try {
			question = new Question_02("10/09/2012 12:00:00");
			assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_03), equalTo("Monday"));
		} catch (Exception e) {
			Assert.fail("Inexpected Fail!");
		}
	}
	
	@Test
	public void testStringDateFormat04() {
		try {
			question = new Question_02("10/09/2012 12:00:00");
			assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_04), equalTo("2012"));
		} catch (Exception e) {
			Assert.fail("Inexpected Fail!");
		}
	}
	
	@Test
	public void testStringDateFormat05() {
		try {
			question = new Question_02("10/09/2012 12:00:00");
			assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_05), equalTo("AD"));
		} catch (Exception e) {
			Assert.fail("Inexpected Fail!");
		}
	}

	// Testing input a date:
	
	@Test
	public void testInputDateFormat01() {
		question = new Question_02(date);
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_01), equalTo("2015-07-25 13:55"));
	}
	
	@Test
	public void testInputDateFormat02() {
		question = new Question_02(date);
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_02), equalTo("25-07-15 13:55:47"));
	}
	
	@Test
	public void testInputDateFormat03() {
		question = new Question_02(date);
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_03), equalTo("Saturday"));
	}
	
	@Test
	public void testInputDateFormat04() {
		question = new Question_02(date);
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_04), equalTo("2015"));
	}
	
	@Test
	public void testInputDateFormat05() {
		question = new Question_02(date);
		assertThat(question.getDateFormatted(DateFormat.DT_FORMAT_05), equalTo("AD"));
	}
	
	// Testing Invalid Date Format:
	
	@Test
	public void testInvalidDateFormat() {
		try {
			question = new Question_02("10/09/2012 11:00:");
			question.getDateFormatted(DateFormat.DT_FORMAT_01);
		} catch (Exception e) {
			assertThat(e.getMessage(), equalTo("Invalid Date Format!"));
		}	
	}
}
