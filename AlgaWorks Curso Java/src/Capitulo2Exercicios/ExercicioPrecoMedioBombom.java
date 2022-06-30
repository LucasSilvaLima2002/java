package Capitulo2Exercicios;

public class ExercicioPrecoMedioBombom {
	
	/*
	 * Um comerciante está curioso para saber o preço médio que vendeu as 3 últimas caixas de bombons e contratou você para desenvolver um programa que resolva isso.

Como você ainda não aprendeu a receber parâmetros, você pediu ao comerciante os 3 últimos preços que ele vendeu as caixas de bombons para incluir dentro do código-fonte do programa (mas prometeu arrumar isso assim que aprendesse).

O comerciante lhe passou os seguintes valores: 5, 8, 12. Desenvolva um programa que calcula a média desses números.
	 */
	
	public static void main(String[] args) {
		
	
	
	float preco1 = 5;
	float preco2 = 8;
	float preco3 = 12;
	
	float calcularMedia = (preco1 + preco2 + preco3) / 3;

	
	
	System.out.println("\"Sistema de Calculo de Media\"");
	System.out.println("Preço 1: " + preco1);
	System.out.println("Preco 2: "+ preco2);
	System.out.println("Preco 3: " + preco3);
	System.out.println("\nMedia dos preços " + calcularMedia);

	}
}
