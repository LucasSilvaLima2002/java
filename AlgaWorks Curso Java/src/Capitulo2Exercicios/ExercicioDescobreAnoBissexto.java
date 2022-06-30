package Capitulo2Exercicios;

import java.util.Scanner;

/*
 * Voc� foi contratado para fazer um programa que descobre se um ano � bissexto ou n�o. O usu�rio ir� informar o valor de um ano e seu programa ir� imprimir na tela se � ou n�o um ano bissexto.

Para saber se um ano � bissexto ou n�o precisamos de saber algumas regrinhas:

S�o bissextos todos os anos m�ltiplos de 400, por exemplo: 1600, 2000, 2400, ...
S�o bissextos todos os m�ltiplos de 4 e n�o m�ltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, ...
N�o s�o bissextos todos os demais anos.
 */

public class ExercicioDescobreAnoBissexto {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do ano ");
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0) {//multiplos de 400
			System.out.println("O ano \"" + ano + "\" � um ano bissexto");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) { // M�ltiplo de 4 e n�o multiplo de 100 s�o bissextos
				System.out.println("O ano \"" + ano + "\" � um ano bissexto");
			} else {
				System.out.println("O ano \"" + ano + "\" n�o � um ano bissexto");
			}
		}else {
			System.out.println("O ano \"" + ano + "\" � um ano bissexto");
		}
	}
}
