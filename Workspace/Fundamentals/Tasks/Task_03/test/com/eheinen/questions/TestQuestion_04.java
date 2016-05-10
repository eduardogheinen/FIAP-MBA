package com.eheinen.questions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.eheinen.questions.question04.Person;

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
	public void testBuildArrayList() {
		assertThat(question.buildArrayList().size(), equalTo(5));
	}
	
	@Test
	public void testShuffleAndRemove() {
		ArrayList<Person> list = question.shuffleAndRemove();
		assertThat(list.size(), equalTo(4));
	}
	
	@Test
	public void testSortByName() {
		ArrayList<Person> list = question.sortByName();
		assertThat(list.get(0).getName(), equalTo("Fernando Ferreira"));
		assertThat(list.get(1).getName(), equalTo("Henrique Fernando"));
		assertThat(list.get(2).getName(), equalTo("Inácio Luís"));
		assertThat(list.get(3).getName(), equalTo("João Garcia"));
		assertThat(list.get(4).getName(), equalTo("Maria Martins"));
	}
	
	@Test
	public void testInvertByName() {
		ArrayList<Person> list = question.reverseByName();
		assertThat(list.get(4).getName(), equalTo("Fernando Ferreira"));
		assertThat(list.get(3).getName(), equalTo("Henrique Fernando"));
		assertThat(list.get(2).getName(), equalTo("Inácio Luís"));
		assertThat(list.get(1).getName(), equalTo("João Garcia"));
		assertThat(list.get(0).getName(), equalTo("Maria Martins"));
	}
}
