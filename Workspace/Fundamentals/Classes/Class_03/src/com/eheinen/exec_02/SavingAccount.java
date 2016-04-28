package com.eheinen.exec_02;

public class SavingAccount extends BankAccount{

	public SavingAccount(String clientName, String clientAddress, String clientCPF) {
		super(clientName, clientAddress, clientCPF);
	}
	
	@Override
	public void withdraw(double value) throws InsufficientFundException{
		if(balance >= value)
			balance -= value;
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
