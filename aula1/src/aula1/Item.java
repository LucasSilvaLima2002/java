package aula1;

//Método construtor
public class Item {
	String nome;
	float valor;
	String marca;
	
	Item(){
		
	}
	
	Item(String nome){
		this.nome = nome;

	}
	
	Item(String nome, String marca){
		this.nome = nome;
		this.marca = marca;
	}
	Item(String nome, String marca, float valor){
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		
	}
}