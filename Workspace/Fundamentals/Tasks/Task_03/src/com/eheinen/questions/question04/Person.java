package com.eheinen.questions.question04;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private char gender;
	private String company;
	
	public Person(String name, int age, char gender, String company) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", company=" + company + "]";
	}
}
