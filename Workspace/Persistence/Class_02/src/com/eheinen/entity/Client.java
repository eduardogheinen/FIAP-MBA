package com.eheinen.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "COMPANY", length = 45)
	private String company;
	
	@OneToMany(mappedBy = "orderPK")
	private Set<Order> orders = new HashSet<>();		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}	
}
