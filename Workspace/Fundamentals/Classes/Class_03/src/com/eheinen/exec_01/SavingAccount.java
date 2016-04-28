package com.eheinen.exec_01;

public class SavingAccount extends BankAccount{

	public SavingAccount(String clientName, String clientAddress, String clientCPF) {
		super(clientName, clientAddress, clientCPF);
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
