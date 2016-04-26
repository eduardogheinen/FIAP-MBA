package com.eheinen.main;

import com.eheinen.exec_01.SpecialAccount;
import com.eheinen.exec_02.BankAccount;
import com.eheinen.exec_03.SavingAccount;

public class Main {

	public static void main(String args[]){
		SpecialAccount specialAccount = new SpecialAccount();
		specialAccount.deposit(100);
		System.out.println("Balance: " + specialAccount.getBalance());
		specialAccount.withdraw(50);
		System.out.println("Balance: " + specialAccount.getBalance());
		
		BankAccount bankAccount = new BankAccount();
		System.out.println("Bank Rate: R$ " + bankAccount.getBankRate());
		System.out.println("Bank Rate: R$ " + bankAccount.getBankRate(10));
		System.out.println("Bank Rate: R$ " + bankAccount.getBankRate(10, 2));
		
		SavingAccount savingAccount = new SavingAccount("Eduardo Heinen", "Paulista Avenue", "000.000.000-00");
		System.out.println(savingAccount.toString());
		savingAccount.deposit(100);
		System.out.println("Balance: " + savingAccount.getBalance());
		savingAccount.withdraw(50);
		System.out.println("Balance: " + savingAccount.getBalance());
	}
}
