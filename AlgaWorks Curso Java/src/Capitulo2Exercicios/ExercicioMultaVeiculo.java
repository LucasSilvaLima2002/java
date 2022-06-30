package Capitulo2Exercicios;

import java.util.Scanner;

public class ExercicioMultaVeiculo {
	
//	O Departamento de Trânsito e Transportes de sua cidade descobriu que você está ficando fera em Java e fez uma proposta muito boa para você desenvolver um programa para radares de velocidade.
//
//	Seu programa será instalado nos equipamentos que identificam a velocidade dos veículos na via e decidem se merecem uma multa ou se podem passar sem problemas. O secretário do departamento passou as seguintes regras:
//
//	Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior que a velocidade permitida na via, o veículo deve ser multado.
//	Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a velocidade permitida na via, o veículo deve ser multado.
//	O programa deve receber as informações de velocidade máxima permitida e a velocidade do veículo através do teclado do computador. No futuro eles pretendem melhorar isso para não precisar que alguém fique o tempo todo digitando as informações.

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o tipo do veiculo? (Carro, Caminhão)");
		String tipoVeiculo = entrada.nextLine();
		System.out.println("Digite o valor maximo da via");
		int velocidadeMaxima = entrada.nextInt();
		System.out.println("Digite a velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();
	
	if((tipoVeiculo.equals("Carro") && velocidadeVeiculo > velocidadeMaxima * 1.1) || (tipoVeiculo.equals("Caminhão") && velocidadeVeiculo > velocidadeMaxima * 1.5)) {
	System.out.println("Velocidade maxima excedida");

	}else {
		System.out.println("Velocidade permitida");
	}
	}
}
