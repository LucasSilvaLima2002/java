package Capitulo2;

import java.util.Scanner;

public class OperadorTernario {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor da sua idade ");
	int idade = entrada.nextInt();
	
	
	//              express�o booleana               caso seja verdadeiro                      caso seja falso
	String indica��o = (idade >= 18)         ?       "adulto"                  :          (idade<=12)?     "crian�a" : "adoslecente";
	
	//int x = (idade>=18) ? 1:2;
	
//	if(idade >= 18) {
//		indica��o = "Adulto";
//	}else {
//		indica��o = "crian�a/adolescente";
//	}
	
	System.out.println("Resultado" + indica��o);
	
}
	
}
