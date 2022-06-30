package br.com.fiap;

import java.util.Scanner;

public class IMC {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	

	System.out.println("Digite o valor da altura:");
	double altura = sc.nextDouble();
	System.out.println("Digite o valor do peso: ");
	double peso = sc.nextDouble();
	
	peso = altura/peso;
	
	if(peso > 18.5 && peso <  25) {
		System.out.println("O peso é ideal");
	}else {
		System.out.println("O peso esta fora do normal");
	}
}
}
