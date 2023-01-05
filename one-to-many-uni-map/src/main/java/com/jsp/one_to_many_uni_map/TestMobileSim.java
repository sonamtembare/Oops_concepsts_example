package com.jsp.one_to_many_uni_map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobileSim {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("sonam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Mobile mobile=new Mobile();
	mobile.setName("OOPOA5s");
	mobile.setBrand("android");
	
	
	Sim sim1 =new Sim();
	sim1.setName("jio");
	sim1.setServise("calling");
	
	Sim sim2= new Sim();
	sim2.setName("idea");
	sim2.setServise("calling");
	
	List<Sim> sim= new ArrayList();
	sim.add(sim1);
	sim.add(sim2);
	
	mobile.setSim(sim);
	
	entityTransaction.begin();
	entityManager.persist(mobile);
	entityManager.persist(sim1);
	entityManager.persist(sim2);
	entityTransaction.commit();
	System.out.println("All good");
}
}
