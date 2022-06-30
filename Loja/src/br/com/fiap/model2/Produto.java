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
	private BigDecimal pre�o;
	
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
	public BigDecimal getPre�o() {
		return pre�o;
	}
	public void setPre�o(BigDecimal pre�o) {
		this.pre�o = pre�o;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", pre�o=" + pre�o + "]";
	}
	
	

}
