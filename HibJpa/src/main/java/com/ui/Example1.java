package com.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.util.JPAUtil;

import cts.model.Employee;

public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Employee e = new Employee();
		System.out.println("emp id: ");
		e.setEmpId(scan.nextInt());
		System.out.println("emp name: ");
		e.setEmpName(scan.next());
		System.out.println("emp salary: ");
		e.setBasic(scan.nextDouble());

		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();

		System.out.println("emp saved...");
		JPAUtil.shutdown();
		scan.close();

	}

}
