package br.edu.univas.orm_jpa;

import javax.persistence.*;

@Entity
public class Produto {
	@Id
	private int cod;
	@Column(name="nomeprod")
	private String nome;
	@Column(name="categprod")
	private int categoria;
	
	public Produto() {}
	
	public Produto(int cod, String nome, int categoria) {
		this.cod = cod;
		this.nome = nome;
		this.categoria = categoria;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Produto [cod=" + cod + ", nome=" + nome + ", categoria=" + categoria + "]";
	}
}
