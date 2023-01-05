package com.jspone_to_one_bimapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sonam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	Person person =new Person();
	person.setDob("01-09-2001");
	person.setName("sonam");
	
	
	Pan pan =new Pan();
	pan.setPan_no(1234567);
 
     person.setPan(pan);
     pan.setPerson(person);
     
     entityTransaction.begin();
     entityManager.persist(person);
     entityManager.persist(pan);
     entityTransaction.commit();
     System.out.println("All good");
	}

}
