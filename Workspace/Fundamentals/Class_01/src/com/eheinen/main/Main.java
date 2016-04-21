package com.eheinen.main;

import com.eheinen.exec_01.Customer;
import com.eheinen.exec_02.ConverterDecimalToBinary;
import com.eheinen.exec_03.Calculate;

public class Main {

	public static void main(String[] args) {
		String data = new Customer("1", "2", "3", "4").toString();
		System.out.println(data);
		
		String binary = new ConverterDecimalToBinary().convert(12);
		System.out.println(binary);
		
		Calculate calc = new Calculate();
		String numbers = calc.toString();
		int max = calc.getMax();
		int min = calc.getMin();
		int sum = calc.getSum();
		int avg = calc.getAverage();
		System.out.println("Numbers = " + numbers);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + avg);
	}

}
