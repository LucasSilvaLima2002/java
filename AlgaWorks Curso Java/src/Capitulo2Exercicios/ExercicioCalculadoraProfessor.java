package Capitulo2Exercicios;

/*
 * Um professor universit�rio precisa de um programa para calcular a �rea de um c�rculo a partir do raio. Isso ir� economizar bastante tempo dele ao elaborar exerc�cios para seus alunos.

O programa tem outros requisitos importantes para o professor: incluir uma op��o para exibir (ou n�o) a f�rmula usada para calcular a �rea e sempre exibir o resultado com casas decimais e tamb�m em inteiro.

O professor ficou sabendo que voc� est� estudando Java e decidiu contratar seus servi�os. Ent�o, m�os � obra!

1. Para calcular a �rea de um c�rculo, deve-se multiplicar o raio ao quadrado por PI. Sabe-se que o valor de PI � uma constante igual a 3.14. Para come�ar, crie um programa chamado "CalculadoraProfessor", defina as vari�veis "pi" e "raio", calcule a �rea e imprima o resultado.
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
