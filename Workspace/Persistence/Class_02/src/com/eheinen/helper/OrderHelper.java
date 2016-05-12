package com.eheinen.helper;

import javax.persistence.EntityManager;

import com.eheinen.entity.Order;

public class OrderHelper {

	private EntityManager em;
	
	public OrderHelper(EntityManager em){
		this.em = em;
	}
	
	public void insert(Order order){
		try{
			em.getTransaction().begin();
			em.persist(order);
			em.getTransaction().commit();
		}
		catch(Exception ex){
			ex.getStackTrace();
		}
	}
	
}
