package com.eheinen.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eheinen.entity.Forum;
import com.eheinen.entity.User;
import com.eheinen.helper.ForumHelper;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Class_02");
		EntityManager em = emf.createEntityManager();
		/*
		Forum forum = new Forum();
		forum.setSubject("How to develop a hello world in Java?");
		forum.setDescription("Class to teach how to develop a inital class.");
		
		Set<User> users = new HashSet<>(Arrays.asList(
				new User(forum, "Eduardo Heinen", "eduardogheinen@gmail.com"),
				new User(forum, "Caio Crazy", "caio.crazy@gmail.com")
		));
		
		forum.setUsers(users);
		
		new ForumHelper(em).insert(forum);
		*/
	}

}
