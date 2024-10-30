package br.edu.univas.orm_jpa;

import javax.persistence.*;

public class Client2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		System.out.println(em.find(Produto.class, 1));
		
		System.out.println(em.createNativeQuery("SELECT * FROM jpa.produto"));
		
		em.close();
		emf.close();
	}
}