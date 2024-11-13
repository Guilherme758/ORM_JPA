package client;

import objetos.*;

import javax.persistence.*;

public class Persist {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("relacionamento-jpa");
		EntityManager em = emf.createEntityManager();
		
//		Cargo2 c1 = new Cargo2(1, "Administrativo");
//		
//		System.out.println(c1);
//		
//		em.getTransaction().begin();
//		em.persist(c1);
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
		
		em.getTransaction().begin();
		Cargo2 cargo_funcionario = em.find(Cargo2.class, 1);
		Funcionario2 f1 = new Funcionario2("222", "Mateus", cargo_funcionario);
		em.persist(f1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
