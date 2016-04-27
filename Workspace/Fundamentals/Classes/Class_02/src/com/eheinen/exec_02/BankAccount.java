package com.eheinen.exec_02;

/**
 * Implemente na classe Conta Bancária as seguintes operações,
 * sabendo que o valor da taxa bancária por dia é R$ 1,00.
 * 	• getTaxaBancaria(): retorna o valor da taxa bancária diária (1 dia).
 * 	• getTaxaBancaria(int dias): retorna o valor da taxa bancária para um
 * 		determinado número de dias
 * 	• getTaxaBancaria(int dias, int meses): retorna o valor da taxa bancária
 * 		para um determinado número de dias e meses.
 * 
 * @author Eduardo Heinen
 */
public class BankAccount {
	private final double BANK_RATE = 1.0d;
	
	public double getBankRate(){
		return BANK_RATE;
	}
	
	public double getBankRate(int days){
		return days * BANK_RATE;
	}
	
	public double getBankRate(int days, int months){
		return (days + months * 30) * BANK_RATE;
	}
}
