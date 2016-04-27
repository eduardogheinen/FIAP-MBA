package com.eheinen.exec_01;

/**
 * Crie uma classe ContaEspecial onde nas operações de saque e
 * depósito sejam descontados 10% do valor a ser depositado ou sacado.
 * Utilize a herança da classe ContaBancaria do exemplo anterior.
 * 
 * @author Eduardo Heinen
 */
public class SpecialAccount extends BankAccount {
	public void withdraw(double value){
		balance -= value - (value * 0.10);
	}
	
	public void deposit(double value){
		balance += value - (value * 0.10);
	}
}
