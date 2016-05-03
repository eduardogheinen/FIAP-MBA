package com.eheinen.main;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

import com.eheinen.exec_03.Client;

public class MainExec03 {

	public static void main(String args[]){
		
		ArrayList<Client> clients = new ArrayList<>(Arrays.asList(
			new Client("Eduardo", 25, true, LocalDateTime.of(2015, 5, 26, 8, 30)),
			new Client("John", 42, true, LocalDateTime.of(2014, 3, 17, 8, 30)),
			new Client("Max", 34, true, LocalDateTime.of(2010, 8, 21, 8, 30)),
			new Client("Maria", 85, true, LocalDateTime.of(2013, 12, 02, 8, 30))
		));
		
		System.out.println(clients);
		
		clients
			.stream()
			.filter(c -> (ChronoUnit.YEARS.between(c.getDatePurchase(), LocalDateTime.now())) > 5)
			.forEach(Client :: setInactive);
		
		System.out.println(clients);
		
	}
	
}
