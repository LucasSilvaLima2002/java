package Capitulo2;

import java.util.Scanner;

public class SwitchPagamentoIpva {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor da placa");
	int finalPlaca = entrada.nextInt();
	
	switch(finalPlaca) {
	case 1:
	System.out.println("Vencimento dia 11 de Janeiro");
	break;
	case 2:
		System.out.println("Vencimento dia 12 de Janeiro");
		break;
		default:
		System.out.println("Sistema n�o foi capaz de avaliar a placa");
	}
	
	
}
	
}
