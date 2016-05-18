package com.eheinen.helper;

import javax.persistence.EntityManager;

import com.eheinen.entity.Client;
import com.eheinen.entity.Order;

public class ClientHelper {

private EntityManager em;
	
	public ClientHelper(EntityManager em){
		this.em = em;
	}
	
	public void insert(Client client){
		try{
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
		}
		catch(Exception ex){
			ex.getStackTrace();
		}
	}
	
	public void addOrder(Order order, int clientID){
		Client client = em.find(Client.class, clientID);
		order.setClient(client);
		client.getOrders().add(order);
		this.insert(client);
	}
	
}
