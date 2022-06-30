package br.fiap.loja.model;

import java.math.BigDecimal;

// POJO - Plain Old Java Object
// BO - Bussiness Object

public class Produto {

	private String nome;
	private String descri��o;
	private BigDecimal pre�o;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}

	public BigDecimal getPre�o() {
		return pre�o;
	}

	public void setPre�o(BigDecimal pre�o) {
		this.pre�o = pre�o;
	}

}
