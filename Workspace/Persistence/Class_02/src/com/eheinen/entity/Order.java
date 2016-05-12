package com.eheinen.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@JoinColumn(name = "NUMORDER")
	private OrderPK orderPK;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE")
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)	
	@Column(name = "CLIENT")	
	private Client client;

	public OrderPK getOrderPK() {
		return orderPK;
	}

	public void setOrderPK(OrderPK orderPK) {
		this.orderPK = orderPK;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}		
}
