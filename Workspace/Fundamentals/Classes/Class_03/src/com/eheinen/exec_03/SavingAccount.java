package com.eheinen.exec_03;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SavingAccount extends BankAccount{

	public SavingAccount(String clientName, String clientAddress, String clientCPF, LocalDateTime birthday, LocalDateTime createdAt) {
		super(clientName, clientAddress, clientCPF, birthday, createdAt);
	}
	
	@Override
	public void withdraw(double value) throws InsufficientFundException{
		if(balance >= value){
			long months = ChronoUnit.MONTHS.between(createdAt, LocalDateTime.now());
			if(months > 12)
				balance -= value;
			else
				balance = (balance - value) * 0.01;
		}
		else
			throw new InsufficientFundException("Insufficient Funds!");
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		SavingAccount account = (SavingAccount) obj;
		if(this.clientCPF.equals(account.getClientCPF()))
			return true;
		else
			return false;
	}
}
