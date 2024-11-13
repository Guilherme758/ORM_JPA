package client;

import javax.persistence.*;
import objetos.*;

public class Find {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("relacionamento-jpa");
		EntityManager em = emf.createEntityManager();
		
		String cpf = "222";
		
		em.getTransaction().begin();
		Funcionario2 f = em.find(Funcionario2.class, cpf);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Cargo: " + f.getCargo().getDescricao());
		
		em.close();
		emf.close();
	}

}
