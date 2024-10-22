package br.edu.univas.orm_jpa;

import javax.persistence.*;

public class Client {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Produto p1 = new Produto(1, "Produto 1", 1);
		Produto p2 = new Produto(2, "Produto 2", 2);
		Produto p3 = new Produto(3, "Produto 3", 3);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}