package br.fiap.loja.model;

import java.math.BigDecimal;

// POJO - Plain Old Java Object
// BO - Bussiness Object

public class Produto {

	private String nome;
	private String descrição;
	private BigDecimal preço;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public BigDecimal getPreço() {
		return preço;
	}

	public void setPreço(BigDecimal preço) {
		this.preço = preço;
	}

}
