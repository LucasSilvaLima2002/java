package Capitulo2Exercicios;

/*
 * Um professor universitário precisa de um programa para calcular a área de um círculo a partir do raio. Isso irá economizar bastante tempo dele ao elaborar exercícios para seus alunos.

O programa tem outros requisitos importantes para o professor: incluir uma opção para exibir (ou não) a fórmula usada para calcular a área e sempre exibir o resultado com casas decimais e também em inteiro.

O professor ficou sabendo que você está estudando Java e decidiu contratar seus serviços. Então, mãos à obra!

1. Para calcular a área de um círculo, deve-se multiplicar o raio ao quadrado por PI. Sabe-se que o valor de PI é uma constante igual a 3.14. Para começar, crie um programa chamado "CalculadoraProfessor", defina as variáveis "pi" e "raio", calcule a área e imprima o resultado.
 */

public class ExercicioCalculadoraProfessor {
	public static void main(String[] args) {

		float pi = 3.14f;
		float raio = 5.3f;

		float area = raio * raio / pi;

		System.out.println("Resultado: " + area);

		int areaEmCasasDecimais = (int) area;

		System.out.println("Resultado: " + areaEmCasasDecimais);
	}

}
