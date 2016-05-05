package com.eheinen.misc.entity;

import java.io.Serializable;
import java.util.List;

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private List<Order> orders;
	
	public Client(){}
	public Client(String name, String email){}
	public Client(int id, String name, String email){}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.getName() + " - Email: " + this.getEmail();
	}
}
