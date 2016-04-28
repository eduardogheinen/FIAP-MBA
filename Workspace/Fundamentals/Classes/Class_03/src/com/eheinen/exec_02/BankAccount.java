package com.eheinen.exec_02;

/**
 * Utilize a classe de Conta Poupan�a do exerc�cio anterior e adapte
 * para que seja feita a compara��o pelo m�todo equals() levando em
 * considera��o o n�mero do CPF.
 * 
 * @author Eduardo Heinen
 */
public abstract class BankAccount {
	protected double balance;
	protected double bankRate = 1.0d;
	protected String clientName;
	protected String clientAddress;
	protected String clientCPF;
	
	public BankAccount(double bankRate){
		this.bankRate = bankRate;
	}
	
	public BankAccount(String clientName, String clientAddress, String clientCPF) {
		super();
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientCPF = clientCPF;
	}
	
	public String getClientName() {
		return clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public String getClientCPF() {
		return clientCPF;
	}

	public void withdraw(double value) throws InsufficientFundException{
		balance -= value;
	}

	public void deposit(double value){
		balance += value;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getBankRate(){
		return bankRate;
	}
	
	public double getBankRate(int days){
		return days * bankRate;
	}
	
	public double getBankRate(int days, int months){
		return (days + months * 30) * bankRate;
	}
	
	@Override
	public String toString(){
		String client = "Name: " + clientName + "\n";
		client += "Address: " + clientAddress + "\n";
		client += "CPF: " + clientCPF;
		return client;
	}
}
