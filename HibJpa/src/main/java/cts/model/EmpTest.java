package cts.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("cts");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Emp1 e=new Emp1();
        Emp1 e1=new Emp1();
        
        e.setEname("pojakka");
        e.setEname("yashwanth");
        
        e.setDname("lorry cleaner");
        
        e1.setEname("keeerthi");
        e1.setDname("panimanisi");
        e.setDname("Kabaddi");
       
        
        em.persist(e);
        em.persist(e1);
        em.getTransaction().commit(); 
        em.close();
        emf.close();
        System.out.println("inserted");
       
	}

}
