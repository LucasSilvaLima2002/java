package Capitulo2Exercicios;

public class ExercicioPrecoMedioBombom {
	
	/*
	 * Um comerciante est� curioso para saber o pre�o m�dio que vendeu as 3 �ltimas caixas de bombons e contratou voc� para desenvolver um programa que resolva isso.

Como voc� ainda n�o aprendeu a receber par�metros, voc� pediu ao comerciante os 3 �ltimos pre�os que ele vendeu as caixas de bombons para incluir dentro do c�digo-fonte do programa (mas prometeu arrumar isso assim que aprendesse).

O comerciante lhe passou os seguintes valores: 5, 8, 12. Desenvolva um programa que calcula a m�dia desses n�meros.
	 */
	
	public static void main(String[] args) {
		
	
	
	float preco1 = 5;
	float preco2 = 8;
	float preco3 = 12;
	
	float calcularMedia = (preco1 + preco2 + preco3) / 3;

	
	
	System.out.println("\"Sistema de Calculo de Media\"");
	System.out.println("Pre�o 1: " + preco1);
	System.out.println("Preco 2: "+ preco2);
	System.out.println("Preco 3: " + preco3);
	System.out.println("\nMedia dos pre�os " + calcularMedia);

	}
}
