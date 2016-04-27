package com.eheinen.exec_03;

/**
 * Seja a classe abaixo ContaBancaria como superclasse da classe
 * ContaPoupanca (dos exemplos anteriores), implemente
 * adequadamente o construtor na classe ContaPoupanca para iniciar
 * seus valores.
 * 
 * @author Eduardo Heinen
 */
public class BankAccount {
	protected double balance;
	
	protected String clientName;
	protected String clientAddress;
	protected String clientCPF;
	
	public BankAccount(String clientName, String clientAddress, String clientCPF) {
		super();
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientCPF = clientCPF;
	}
	
	public void withdraw(double value){
		balance -= value;
	}

	public void deposit(double value){
		balance += value;
	}
	
	public double getBalance(){
		return balance;
	}
	
	@Override
	public String toString(){
		String client = "Name: " + clientName + "\n";
		client += "Address: " + clientAddress + "\n";
		client += "CPF: " + clientCPF;
		return client;
	}
}
