package Capitulo2Exercicios;

import java.util.Scanner;

public class ExercicioMultaVeiculo {
	
//	O Departamento de Tr�nsito e Transportes de sua cidade descobriu que voc� est� ficando fera em Java e fez uma proposta muito boa para voc� desenvolver um programa para radares de velocidade.
//
//	Seu programa ser� instalado nos equipamentos que identificam a velocidade dos ve�culos na via e decidem se merecem uma multa ou se podem passar sem problemas. O secret�rio do departamento passou as seguintes regras:
//
//	Se o ve�culo for um carro de passeio e a velocidade do ve�culo for 10% maior que a velocidade permitida na via, o ve�culo deve ser multado.
//	Se o ve�culo for um caminh�o e a velocidade do ve�culo for 5% maior que a velocidade permitida na via, o ve�culo deve ser multado.
//	O programa deve receber as informa��es de velocidade m�xima permitida e a velocidade do ve�culo atrav�s do teclado do computador. No futuro eles pretendem melhorar isso para n�o precisar que algu�m fique o tempo todo digitando as informa��es.

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o tipo do veiculo? (Carro, Caminh�o)");
		String tipoVeiculo = entrada.nextLine();
		System.out.println("Digite o valor maximo da via");
		int velocidadeMaxima = entrada.nextInt();
		System.out.println("Digite a velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();
	
	if((tipoVeiculo.equals("Carro") && velocidadeVeiculo > velocidadeMaxima * 1.1) || (tipoVeiculo.equals("Caminh�o") && velocidadeVeiculo > velocidadeMaxima * 1.5)) {
	System.out.println("Velocidade maxima excedida");

	}else {
		System.out.println("Velocidade permitida");
	}
	}
}
