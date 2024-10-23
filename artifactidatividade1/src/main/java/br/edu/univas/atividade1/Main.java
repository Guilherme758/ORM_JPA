package br.edu.univas.atividade1;

import javax.persistence.*;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade1-jpa");
		EntityManager em = emf.createEntityManager();
		
		Aluno a1 = new Aluno(1, "Aluno 1", 1);
		Aluno a2 = new Aluno(2, "Aluno 2", 2);
		
		em.getTransaction().begin();
		
		em.persist(a1);
		em.persist(a2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}