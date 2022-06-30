package Capitulo2;

import java.util.Scanner;

public class EscopoDeVariaveis {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String pai = "";
	
		
		System.out.println("Qual a sua idade? ");
		int idade = entrada.nextInt();
		boolean podeDirigir = idade >= 18;
		
		if(!podeDirigir) {
			System.out.println("Nome do pai:");
			pai = entrada.next();
		}
		System.out.println("Voce pode dirigir ?");
			
			
		if(podeDirigir) {
	      System.out.println("Sim claro! ");
		}else {
			System.out.println("Não, se eu fizer isso, seu pai " + pai + " vai ser preso");
		}
		
		
	}

}
