package com.eheinen.questions.question_04;

import com.eheinen.utils.InvalidNumberException;

public interface BasicCalculator {

	public float sum(float num1, float num2) throws InvalidNumberException;
	public float subtract(float num1, float num2) throws InvalidNumberException;
	public float divide(float num1, float num2) throws InvalidNumberException;
	public float multiply(float num1, float num2) throws InvalidNumberException;
	
}
