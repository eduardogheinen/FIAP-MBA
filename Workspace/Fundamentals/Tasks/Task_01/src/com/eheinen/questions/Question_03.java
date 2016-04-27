package com.eheinen.questions;

import javax.swing.JOptionPane;

import com.eheinen.utils.MyUtils;

/**
 * Construa um programa que crie um vetor para coletar informações de salários de
 * determinados funcionários. O programa inicialmente deverá questionar a
 * quantidade de funcionários que servirá para determinar o tamanho do vetor.
 * Após isso, será questionado o salário para cada funcionário deste vetor. Ao final,
 * o programa deverá informar a média salarial da empresa.
 * Nota: utilize o comando JOptionPane.showInputDialog para a entrada de dados.
 * Como este comando retorna o tipo String, faça a conversão de tipos apropriada (classes wrappers).
 * 
 * @author Eduardo Heinen
 */

public class Question_03 {

	private MyUtils utils;
	
	public Question_03(){
		utils = new MyUtils();
	}
	
	private int openInputEmployeeAmount(){
		boolean isValid = false;
		String inputValue = null;
		while(isValid == false){
			inputValue = JOptionPane.showInputDialog("Is there how many employees in the company?");
			isValid = utils.isValidInteger(inputValue);
		}
		return Integer.parseInt(inputValue);
	}
	
	private double[] openInputSalary(int employeeAmount){
		double[] salaryArray = new double[employeeAmount];
		for(int i=0; i<employeeAmount; i++){
			boolean isValid = false;
			String inputValue = null;
			while(isValid == false){
				inputValue = JOptionPane.showInputDialog("What is the salary of the employee " + (i + 1) + "?");
				isValid = utils.isValidDouble(inputValue);
			}
			salaryArray[i] = Double.parseDouble(inputValue);
		}
		return salaryArray;
	}
	
	public double salaryAverage(){
		int employeeAmount = openInputEmployeeAmount();
		double[] salaryArray = openInputSalary(employeeAmount);
		return this.salaryAverage(employeeAmount, salaryArray);
	}
	
	public double salaryAverage(int employeeAmount, double[] salaryArray){
		double average = 0.0d;
		for (double salary : salaryArray) {
			average += salary;
		}
		average = average / employeeAmount;
		System.out.println("Salary Average: R$ " + average);
		return average;
	}
}
