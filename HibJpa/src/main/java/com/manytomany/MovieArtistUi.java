package com.manytomany;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.util.JPAUtil;

public class MovieArtistUi {

	public static void main(String[] args) {
	
		Artist a1=new Artist(101, "sam", new TreeSet<Movie>());
		Artist a2=new Artist(102, "prabhas", new TreeSet<Movie>());
		Artist a3=new Artist(103, "kondanna", new TreeSet<Movie>());
		
		Movie m1=new Movie(101, "ohbaby", new TreeSet<Artist>());
		Movie m2=new Movie(102, "bhaubhali", new TreeSet<Artist>());
		
		m1.getArtists().add(a1);
		m1.getArtists().add(a3);
		
		m2.getArtists().add(a2);
		m2.getArtists().add(a3);
		
		a1.getMovies().add(m1);
		a2.getMovies().add(m2);
		a3.getMovies().add(m1);
		a3.getMovies().add(m2);
		
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		txn.commit();
		System.out.println("saved");
		JPAUtil.shutdown();

		
		
		
	}

}
