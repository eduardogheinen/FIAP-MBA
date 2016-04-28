package com.eheinen.exec_03;

import java.time.LocalDateTime;

/**
 * Inclua na classe abstrata Conta Bancária o atributo data de 
 * nascimento do cliente e data da criação da conta. Na classe Conta
 * Poupança, sobrescreva o método sacar para que seja cobrado 1% por
 * saque efetuado até que o cliente complete 1 ano após a criação de 
 * sua conta bancária.
 * 
 * @author Eduardo Heinen
 */
public abstract class BankAccount {
	protected double balance;
	protected double bankRate = 1.0d;
	protected String clientName;
	protected String clientAddress;
	protected String clientCPF;
	protected LocalDateTime birthday;
	protected LocalDateTime createdAt;
	
	public BankAccount(double bankRate){
		this.bankRate = bankRate;
	}
	
	public BankAccount(String clientName, String clientAddress, String clientCPF, LocalDateTime birthday, LocalDateTime createdAt) {
		super();
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientCPF = clientCPF;
		this.birthday = birthday;
		this.createdAt = createdAt;				
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
	
	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public void setClientCPF(String clientCPF) {
		this.clientCPF = clientCPF;
	}

	@Override
	public String toString(){
		String client = "Name: " + clientName + "\n";
		client += "Address: " + clientAddress + "\n";
		client += "CPF: " + clientCPF;
		return client;
	}
}
