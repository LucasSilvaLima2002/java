package exercicios;

import java.util.Scanner;



public class HomensEMulheresTeste {
	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		
		 HomensEMulheres c1[]  = new HomensEMulheres[10];
		 
		 for (int i=0; i<10; i++) {
	            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
	            c1[i].sexo = entrada.nextInt();
	            System.out.print("Digite a altura: ");
	            c1[i].altura = entrada.nextFloat();
	            c1[i].quantidadeDeMulheres();
		 }
		
	
		entrada.close();
		
	}

}