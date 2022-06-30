package br.com.fiap;

public class Banco {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("João Carlos");
		
		System.out.println(conta.getTitular());
		
		Conta conta2 = new Conta();
		conta2.setTitular("Maria Silva");
		conta2.setJuros(0);
		
		System.out.println(conta2.getTitular());
		System.out.println(conta2.getJuros());
	}

}
N