package com.eheinen.main;

import com.eheinen.exec_01.SpecialAccount;

public class Main {

	public static void main(String args[]){
		SpecialAccount account = new SpecialAccount();
		account.deposit(100);
		System.out.println("Balance: " + account.getBalance());
		account.withdraw(50);
		System.out.println("Balance: " + account.getBalance());
	}
}
