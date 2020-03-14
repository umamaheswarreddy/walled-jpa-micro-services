package com.hasa.onetomany;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.util.JPAUtil;

public class TraineeCourceUi {

	public static void main(String[] args) {
		
		Cource mca=new Cource(101,"MCA",new TreeSet<Trainee>());
		Cource mba=new Cource(102,"MCA",new TreeSet<Trainee>());
		
		mca.getTrainees().add(new Trainee(201,"sam",mca));
		mca.getTrainees().add(new Trainee(202,"ram",mca));
		mca.getTrainees().add(new Trainee(203,"jam",mca));
		
		mba.getTrainees().add(new Trainee(301,"kam",mba));
		mba.getTrainees().add(new Trainee(302,"gam",mba));
		mba.getTrainees().add(new Trainee(303,"tam",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
		System.out.println("saved");
		JPAUtil.shutdown();

	}

}
