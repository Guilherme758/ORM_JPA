package veiculo;

import javax.persistence.*;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Veiculo v = new Veiculo(1, "Fiat", "Desc", "1.0", "Uno", "2000", 1);
		
		em.getTransaction().begin();
		
		// Insert
		em.persist(v);
		// em.getTransaction().commit();
	
		// Select
		Veiculo x = em.find(Veiculo.class, 1);
		System.out.println("Chassi: " + x.getChassi() + "\nModelo: " + x.getModelo());
		
		// Update
		x.setModelo("Marea");
		x.setVersao("2.2");
		em.merge(x);
		// em.getTransaction().commit();
		
		// Delete
		em.remove(x);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
