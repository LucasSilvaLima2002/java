package Capitulo2;

import java.util.Scanner;

public class EntradaDeDadosEOperadoresLogicos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Peso: ");
		int peso = entrada.nextInt();

		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Sexo (1 para M ou outro numero para F)");
		char sexo = entrada.nextShort() == 1? 'M' : 'F';

		
		double imc =peso/(altura * altura);
		System.out.print("IMC de " + nome + " : " + imc);
		
//		if(imc < 19.5) {
//			System.out.println("Abaixo do peso ideal");
//		}
//			else if(imc < 25) {
//				System.out.println("Peso ideal");
//			}else if(imc < 30) {
//				System.out.println("Acima do peso");
//			}else if(imc < 40) {
//				System.out.println("Obesidade grau 1 ou 2");
//			}else {
//				System.out.println("Obesidade grau 3");
//			}
//		}
		
//		if(sexo == 'F' &&  imc<19.1) {
//			System.out.println("Abaixo do peso ideal");
//		}else if(sexo == 'F' && imc<=25.8) {
//			System.out.println("Peso ideal");
//		}else if(sexo == 'F' && imc<=27.3) {
//			System.out.println("Acima do peso");
//		}else if(sexo == 'M' && imc<=20.8) {
//			System.out.println("Abaixo do peso ideal");
//		}else if(sexo == 'M' && imc<=26.4) {
//			System.out.println("Peso ideal");
//		}
		
		if((sexo == 'F' &&  imc<19.1) || (sexo == 'M' && imc<=20.8))  {
			System.out.println(" Abaixo do peso ideal");
		}else if((sexo == 'F' &&  imc<25.8) || (sexo == 'M' && imc<=26.4))  {
			System.out.println(" Peso ideal");
		}else if((sexo == 'F' &&  imc<27.3) || (sexo == 'M' && imc<=27.8))  {
			System.out.println(" Acima do peso ideal");
		}
}
}
