package Capitulo2;

public class OperadoresDeComparaçãoEIgualdade {
	public static void main(String[] args) {
		
		/*
		 * maior = >
		 * menor = <
		 * maior ou igual = >=
		 * menor ou igual =<
		 * igual ==
		 * diferente !=
		 */

		int a = 10;
		int b = 5;
		int c = 2;

		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;

		System.out.println(maior); //false
		System.out.println(maiorOuIgual);//false
		System.out.println(menor);//false
		System.out.println(menorOuIgual);//true
		System.out.println(igual);//false
		System.out.println(diferente);//true

		
	
		boolean bloqueado = false;
		bloqueado = ! bloqueado;
		boolean teste = false;
		teste = ! (b>a);

		System.out.println("\n" + bloqueado);
		System.out.println("\n" + teste);
	}

}
