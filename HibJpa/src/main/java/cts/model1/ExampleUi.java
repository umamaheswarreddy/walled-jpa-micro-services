package cts.model1;

import javax.persistence.EntityManager;

import com.util.JPAUtil;

public class ExampleUi {

	public static void main(String[] args) {
		
		Emp e=new Emp(106,"sam",25000);
		MEmp m=new MEmp(104,"ram",1500,9500);
		CEmp ce=new CEmp(108,"janu",15000,11);
		
		
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		
		System.out.println("emp saved...");
		JPAUtil.shutdown();

	}

}
