package veiculo;

import javax.persistence.*;

@Entity
public class Veiculo {
	@Id
	private int chassi;
	@Column
	private String fabricante;
	@Column
	private String descricao;
	@Column
	private String versao;
	@Column
	private String modelo;
	@Column
	private String ano;
	@Column
	private int qtde;
	
	public Veiculo() {}
	
	public Veiculo(int chassi, String fabricante, String descricao, String versao, String modelo, String ano, int qtde) {
		this.chassi = chassi;
		this.fabricante = fabricante;
		this.descricao = descricao;
		this.versao = versao;
		this.modelo = modelo;
		this.ano = ano;
		this.qtde = qtde;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
}
