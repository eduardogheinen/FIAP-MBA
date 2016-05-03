package com.eheinen.exec_03;

import java.time.LocalDateTime;

public class Client {
	private String name;
	private int age;
	private boolean isActive;
	private LocalDateTime datePurchase;
	
	public Client(String name, int age, boolean isActive,
			LocalDateTime datePurchase) {
		super();
		this.name = name;
		this.age = age;
		this.isActive = isActive;
		this.datePurchase = datePurchase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public void setInactive() {
		this.isActive = false;
	}

	public LocalDateTime getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(LocalDateTime datePurchase) {
		this.datePurchase = datePurchase;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + ", isActive="
				+ isActive + ", datePurchase=" + datePurchase + "]";
	}
}
