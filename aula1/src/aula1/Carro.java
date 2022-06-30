package aula1;
//ATRIBUTOS E METODOS

public class Carro {
String nome;
String marca;
int ano;
int velocidade;

void acelerar (int aceleracao) {
	velocidade += aceleracao ;
	
}
void frear (int reduzir) {
	velocidade -= reduzir;
}
void buzinar() {
	System.out.println("bibibibi");
}
}