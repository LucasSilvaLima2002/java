package Capitulo2;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero inicial ");
		int numeroInicial = entrada.nextInt();
		
		System.out.println("Digite o valor final ");
		int numeroFnal = entrada.nextInt();
		
		int numeroAtual = numeroInicial;
		
		while(numeroAtual<=numeroFnal) {
			System.out.println(numeroAtual);
			numeroAtual++;
		}
		
		
		
	}

}
