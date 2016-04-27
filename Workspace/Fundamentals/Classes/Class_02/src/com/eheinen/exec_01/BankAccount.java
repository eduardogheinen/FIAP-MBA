package com.eheinen.exec_01;

public class BankAccount {
	protected double balance;
	
	public void withdraw(double value){
		balance -= value;
	}
	
	public void deposit(double value){
		balance += value;
	}
	
	public double getBalance(){
		return balance;
	}
}
