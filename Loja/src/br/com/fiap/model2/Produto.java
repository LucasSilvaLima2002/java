package br.com.fiap.model2;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


//POJO - 	Plain Old Java Object
//BO - BUSSINESS OBJECT
//ORM
@Entity
public class Produto {
	
	@id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preço;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreço() {
		return preço;
	}
	public void setPreço(BigDecimal preço) {
		this.preço = preço;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preço=" + preço + "]";
	}
	
	

}
