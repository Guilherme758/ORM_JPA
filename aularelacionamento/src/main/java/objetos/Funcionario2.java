package objetos;

import javax.persistence.*;

@Entity
public class Funcionario2 {
	@Id
	private String cpf;
	@Column
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "id_cargo")
	private Cargo2 cargo;
	
	public Funcionario2() {
		
	}
	
	public Funcionario2(String cpf, String nome, Cargo2 cargo) {
		this.cpf = cpf;
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo2 getCargo() {
		return cargo;
	}

	public void setCargo(Cargo2 cargo) {
		this.cargo = cargo;
	}
}
