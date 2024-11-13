package objetos;

import javax.persistence.*;

@Entity
public class Cargo2 {
	@Id
	Integer id;
	@Column
	String descricao;
	
	public Cargo2() {
		
	}
	
	public Cargo2(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
