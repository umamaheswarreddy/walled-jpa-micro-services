package com.manytomany;

import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;
import com.util.JPAUtil;

import cts.model.Employee;

public class ExampleJpql {

	public static void main(String[] args) {
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		Employee emp=em.find(Employee.class, 509);
		if(emp!=null) {
			System.out.println(emp);
		}
		String qryString="SELECT e FROM Employee e";
		javax.persistence.Query qry=em.createQuery(qryString);
		display(qry.getResultList());
		display(em.createQuery("SELECT e FROM Employee e WHERE e.basic>2500").getResultList());
		List<String> names=em.createQuery("SELECT e.empName FROM Employee e").getResultList();
		for(String n:names) {
			System.out.println(n);
		}
		em.close();
		System.out.println("done baby!");
		JPAUtil.shutdown();
		

	}

	 static void display(List<Employee> data) {
		System.out.println("***********************");
		
		for(Employee e:data) {
			System.out.println(e);
		}
		System.out.println("------------------------");
		
		
	}

}
