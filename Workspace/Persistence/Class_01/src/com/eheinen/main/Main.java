package com.eheinen.main;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;

import com.eheinen.misc.dao.ClientDao;
import com.eheinen.misc.dao.OrderDao;
import com.eheinen.misc.entity.Client;
import com.eheinen.misc.entity.Order;

public class Main {

	private static ClientDao clientDao = new ClientDao();
	private static OrderDao orderDao = new OrderDao();
	
	public static void main(String[] args){
		
		
	}	
}

private static void runInteractWith(){
	String name = JOptionPane.showInputDialog("Type your name:");
	String email = JOptionPane.showInputDialog("Type your email:");
	clientDao.insert(new Client(name, email));
	
	String clientID = JOptionPane.showInputDialog("Type your name:");
	String date = JOptionPane.showInputDialog("Type your email:");
	String description = JOptionPane.showInputDialog("Type your email:");
	String value = JOptionPane.showInputDialog("Type your email:");
	
	
}

private static void runScript(){		
	Client client = new Client();
	client.setName("Eduardo Heinen " + new Random().nextInt());
	client.setEmail("eduardogheinen@gmail.com " + new Random().nextInt());
	
	try {
		clientDao.insert(client);
		System.out.println(clientDao.select(1));
		clientDao.select().forEach(c -> System.out.println(c));
	} catch (Exception e) {
		System.out.println("Sorry, could not insert/select record! " + e);
	}
	
	
	
	
	Order order = new Order();
	order.setClientID(1);
	order.setDate(Date.from(Instant.now()));
	order.setDescription("Hello World! " + new Random().nextInt());
	order.setValue(new Random().nextInt());
	
	try {
		orderDao.insert(order);
		System.out.println(orderDao.select(1));
		orderDao.select().forEach(c -> System.out.println(c));
	} catch (Exception e) {
		System.out.println("Sorry, could not insert/select record! " + e);
	}
}
