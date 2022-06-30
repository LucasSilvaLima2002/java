package br.com.fiap;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	private double juros;

	public String getTitular(){
		return titular;
	}
	public void setTitular(String nomedoTitular){
		titular = nomedoTitular;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double TaxaDeJuros) {
		if(TaxaDeJuros >=0 ) 
		juros = TaxaDeJuros;
	}
}
