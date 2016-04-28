package com.eheinen.exec_04;

public enum ClientClassificationEnum {
	
	POTENTIAL(400000d, 500000d),
	MEDIUM(200000d, 400000d),
	LOW(0.0d, 200000d);
	
	private double balanceMin;
	private double balanceMax;
	
	private ClientClassificationEnum(double balanceMin, double balanceMax) {
		this.balanceMin = balanceMin;
		this.balanceMax = balanceMax;
	}
	
	public double getBalanceMin(){
		return this.balanceMin;
	}
	
	public double getBalanceMax(){
		return this.balanceMax;
	}
	
	public boolean isCompatible(BankAccount bankAccount){
		if(bankAccount.getBalance() <= balanceMax && (bankAccount.getBalance() >= balanceMin)){
			System.out.println("It is compatible!");
			return true;
		}
		else{
			System.out.println("It is not compatible!");
			return false;
		}
	}
}
