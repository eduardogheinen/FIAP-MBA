package com.eheinen.main;

import com.eheinen.questions.question_01.Thread_01;
import com.eheinen.questions.question_01.Thread_02;
import com.eheinen.questions.question_01.Thread_03;
import com.eheinen.questions.question_02.Airplane;
import com.eheinen.questions.question_02.Airport;
import com.eheinen.questions.question_03.ColorEnum;

public class Main {

	public static void main(String[] args){
		
		// Task 1:
		Thread_01 t1 = new Thread_01();
		Thread_02 t2 = new Thread_02();
		Thread_03 t3 = new Thread_03(t1, t2);
		t1.start();
		t2.start();
		t3.start();
		
		
		// Task 2:
		Airport airport = new Airport();
		airport.start();
		Airplane airPlaneOne = new Airplane("TAM 123", airport);
		Airplane airPlaneTwo = new Airplane("GOL 475", airport);
		Airplane airPlaneThree = new Airplane("AVIANCA 947", airport);
		airPlaneOne.start();
		airPlaneTwo.start();
		airPlaneThree.start();
		
		// Task 3:
		System.out.println(ColorEnum.WHITE.getColorCode() + " - " + ColorEnum.WHITE.getColorName());
		System.out.println(ColorEnum.BLACK.getColorCode() + " - " + ColorEnum.BLACK.getColorName());
		System.out.println(ColorEnum.RED.getColorCode() + " - " + ColorEnum.RED.getColorName());
		System.out.println(ColorEnum.YELLOW.getColorCode() + " - " + ColorEnum.YELLOW.getColorName());
		System.out.println(ColorEnum.BLUE.getColorCode() + " - " + ColorEnum.BLUE.getColorName());
	}
	
}
