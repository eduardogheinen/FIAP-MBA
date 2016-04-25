package com.eheinen.exec_01;

public class SpecialAccount extends BankAccount {
	public void withdraw(double value){
		balance -= value - (value * 0.10);
	}
	
	public void deposit(double value){
		balance += value - (value * 0.10);
	}
}
