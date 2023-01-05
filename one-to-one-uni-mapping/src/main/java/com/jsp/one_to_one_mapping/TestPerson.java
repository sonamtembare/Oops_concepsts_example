package com.jsp.one_to_one_mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.ElementTraversal;

public class TestPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sonam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Pan pan = new Pan();
		pan.setPan_no("12678");
		
		Person person = new Person();
		person.setDob("16-06-2001");
		person.setName("ashwini");
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		System.out.println("All good");
	}

}
