package com.eheinen.main;

import com.eheinen.exec_01.SpecialAccount;
import com.eheinen.exec_02.BankAccount;
import com.eheinen.exec_03.SavingAccount;
import com.eheinen.exec_04.ClientClassificationEnum;

public class Main {

	public static void main(String args[]){
		// Exercise 1:
		SpecialAccount specialAccount = new SpecialAccount();
		specialAccount.deposit(100);
		System.out.println("Balance: " + specialAccount.getBalance());
		specialAccount.withdraw(50);
		System.out.println("Balance: " + specialAccount.getBalance());
		
		// Exercise 2:
		BankAccount bankAccount = new BankAccount();
		System.out.println("Bank Rate: R$ " + bankAccount.getBankRate());
		System.out.println("Bank Rate: R$ " + bankAccount.getBankRate(10));
		System.out.println("Bank Rate: R$ " + bankAccount.getBankRate(10, 2));
		
		// Exercise 3:
		SavingAccount savingAccount = new SavingAccount("Eduardo Heinen", "Paulista Avenue", "000.000.000-00");
		System.out.println(savingAccount.toString());
		savingAccount.deposit(100);
		System.out.println("Balance: " + savingAccount.getBalance());
		savingAccount.withdraw(50);
		System.out.println("Balance: " + savingAccount.getBalance());
		
		// Exercise 4:
		com.eheinen.exec_04.SavingAccount savingAccount2 = 
				new com.eheinen.exec_04.SavingAccount("Eduardo Heinen", "Paulista Avenue", "000.000.000-00");
		savingAccount2.deposit(100);
		ClientClassificationEnum.POTENTIAL.isCompatible(savingAccount2);
		ClientClassificationEnum.MEDIUM.isCompatible(savingAccount2);
		ClientClassificationEnum.LOW.isCompatible(savingAccount2);
		
		savingAccount2.deposit(200000);
		ClientClassificationEnum.POTENTIAL.isCompatible(savingAccount2);
		ClientClassificationEnum.MEDIUM.isCompatible(savingAccount2);
		ClientClassificationEnum.LOW.isCompatible(savingAccount2);
		
		savingAccount2.deposit(200000);
		ClientClassificationEnum.POTENTIAL.isCompatible(savingAccount2);
		ClientClassificationEnum.MEDIUM.isCompatible(savingAccount2);
		ClientClassificationEnum.LOW.isCompatible(savingAccount2);
	}
}
