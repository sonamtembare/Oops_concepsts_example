package com.jsp.one.to.many.bi.directional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToMany {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sonam");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("sonam");
		person.setEmail("sonam@gmail.com");
		person.setPh_no(12454465);
		
		BankAccount bankAccount1=new BankAccount();
		bankAccount1.setBank_name("HDFC");
		bankAccount1.setAcc_no(765686547);
		bankAccount1.setIfsc("HDFC12354");
		
		BankAccount bankAccount2=new BankAccount();
		bankAccount2.setBank_name("IDFC");
		bankAccount2.setAcc_no(34678678);
		bankAccount2.setIfsc("IDFC1123");
		
		BankAccount bankAccount3=new BankAccount();
		bankAccount3.setBank_name("HDFC");
		bankAccount3.setAcc_no(765686547);
		bankAccount3.setIfsc("HDFC12354");
		
		BankAccount bankAccount4=new BankAccount();
		bankAccount4.setBank_name("HDFC");
		bankAccount4.setAcc_no(765686547);
		bankAccount4.setIfsc("HDFC12354");
		
		List<BankAccount> bankAccount=new ArrayList();
		bankAccount.add(bankAccount1);
		bankAccount.add(bankAccount2);
		bankAccount.add(bankAccount3);
		bankAccount.add(bankAccount4);
		
		person.setBankAccount(bankAccount);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(bankAccount1);
		entityManager.persist(bankAccount2);
		entityManager.persist(bankAccount3);
		entityManager.persist(bankAccount4);
		entityTransaction.commit();
		System.out.println("All good");
		
		
		
	}
}
