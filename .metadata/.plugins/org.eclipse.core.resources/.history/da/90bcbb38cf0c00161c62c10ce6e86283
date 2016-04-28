package com.eheinen.exec_04;

/**
 * Crie um tipo enumerado como classe para validar a classificação dos clientes
 * de uma determinada instituição bancária. Os critérios devem ser os seguintes:
 * 	• POTENCIAL: cliente com saldo entre R$ 400.000,00 e R$ 500.000,00.
 * 	• MÉDIO: cliente com saldo entre R$ 200.000,00 e R$ 400.000,00.
 * 	• BAIXO: cliente com saldo positivo e inferior a R$ 200.000,00.
 * A classe deverá implementar um método para verificar a compatibilidade
 * (isCompatible) com objetos do tipo ContaBancaria dos exercícios anteriores e
 * realizando o teste com um objeto de ContaPoupanca.
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
	
	public void withdraw(double value){
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
