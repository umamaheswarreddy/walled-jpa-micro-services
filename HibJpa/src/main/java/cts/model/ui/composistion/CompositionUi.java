package cts.model.ui.composistion;

import javax.persistence.EntityManager;

import com.util.JPAUtil;

public class CompositionUi {

	public static void main(String[] args) {
		
		Faculty f=new Faculty("sam", 
				new Address("A201","krpalli cross","bengalure,karnataka"));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		
		System.out.println("saved");
		JPAUtil.shutdown();
		
	}

}
