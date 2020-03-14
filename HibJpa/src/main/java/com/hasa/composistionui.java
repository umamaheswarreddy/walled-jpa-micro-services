package com.hasa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.util.JPAUtil;

public class composistionui {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("888855599","sam",ba);
		ba.setAccno("5B001");
		ba.setCustomer(cs);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(cs);
		txn.commit();
		JPAUtil.shutdown();

	}

}
