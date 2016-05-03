package com.eheinen.main;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.eheinen.exec_01.Exercise_01;

public class Main {

	public static void main(String args[]){
		
		Exercise_01 ex = new Exercise_01();
		
		// ArrayList
		
		LocalDateTime begin = LocalDateTime.now();

		for(int i=0; i<10000000; i++){
			ex.getArrayList().add("" + i);
		}
		
		LocalDateTime end = LocalDateTime.now();

		long time = ChronoUnit.MILLIS.between(begin, end);
		System.out.println("ArrayList Populate: " + time);
		
		
		begin = LocalDateTime.now();
		ex.getArrayList().get(500000);
		end = LocalDateTime.now();
		
		time = ChronoUnit.MILLIS.between(begin, end);
		System.out.println("ArrayList Search: " + time);
		
		// LinkedList
		
		begin = LocalDateTime.now();
		
		for(int i=0; i<10000000; i++){
			ex.getLinkedList().add("" + i);
		}
	
		end = LocalDateTime.now();
		
		time = ChronoUnit.MILLIS.between(begin, end);
		System.out.println("LinkedList Populate: " + time);
		
		begin = LocalDateTime.now();
		ex.getLinkedList().get(500000);
		end = LocalDateTime.now();
		
		time = ChronoUnit.MILLIS.between(begin, end);
		System.out.println("ArrayList Search: " + time);
	}
	
}
