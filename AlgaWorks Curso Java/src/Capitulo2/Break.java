package Capitulo2;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero:");
		int divisor = entrada.nextInt();
		
//		for(int i= 100;i<=200;i++) {
//			if(i % divisor == 0) {
//				break;
//			}
//			System.out.println(i);
//		}
		for(int i= 100;i<=120;i++) {
			if(i % divisor == 0) {
				continue;
				//pula o if
				//se ele encontrar a condição ele continua
			}
			System.out.println(i);
		}
	}
	

}
