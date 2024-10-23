package br.edu.univas.atividade1;

import javax.persistence.*;

@Entity
public class Aluno {
	@Id
	private int matricula;
	@Column(name="nome_aluno")
	private String nome;
	@Column(name="turma_aluno")
	private int turma;
	
	public Aluno() {}
	
	public Aluno(int matricula, String nome, int turma) {
		this.matricula = matricula;
		this.nome = nome;
		this.turma = turma;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTurma() {
		return turma;
	}

	public void setTurma(int turma) {
		this.turma = turma;
	}
}
