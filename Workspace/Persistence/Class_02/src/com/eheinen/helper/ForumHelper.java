package com.eheinen.helper;

import javax.persistence.EntityManager;

import com.eheinen.entity.Forum;

public class ForumHelper {

	private EntityManager em;
	
	public ForumHelper(EntityManager em){
		this.em = em;
	}
	
	public void insert(Forum forum){
		try{
			em.getTransaction().begin();
			em.persist(forum);
			em.getTransaction().commit();
		}
		catch(Exception ex){
			
		}
	}
	
}
