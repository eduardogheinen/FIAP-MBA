package com.eheinen.main;

import com.eheinen.exec_01.SavingAccount;
import com.eheinen.exec_02.InsufficientFundException;

public class Main {

	public static void main(String args[]){
		// Exercise 1:
		SavingAccount savingAccount1 = new SavingAccount("Eduardo Heinen", "Paulista Avenue", "000.000.000-00");
		SavingAccount savingAccount2 = new SavingAccount("Eduardo Heinen 2", "Paulista Avenue 2", "000.000.000-00");
		SavingAccount savingAccount3 = new SavingAccount("Eduardo Heinen 2", "Paulista Avenue 2", "000.000.000-01");
		
		System.out.println(savingAccount1.equals(savingAccount2));
		System.out.println(savingAccount1.equals(savingAccount3));
		
		// Exercise 2:
		com.eheinen.exec_02.SavingAccount savingAccount4 = new com.eheinen.exec_02.SavingAccount("Eduardo Heinen", "Paulista Avenue", "000.000.000-00");		
		
		try {
			savingAccount4.deposit(1000);
			System.out.println(savingAccount4.getBalance());
			savingAccount4.withdraw(500);
			System.out.println(savingAccount4.getBalance());
			savingAccount4.withdraw(500);
			System.out.println(savingAccount4.getBalance());
			savingAccount4.withdraw(0.1);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
