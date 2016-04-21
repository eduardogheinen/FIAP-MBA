package com.eheinen.main;

import com.eheinen.exec_01.Customer;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("1", "2", "3", "4");
		String data = c.toString();
		System.out.println(data);
	}

}
