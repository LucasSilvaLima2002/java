package Capitulo2;

import java.util.Scanner;

public class OperadorTernario {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o valor da sua idade ");
	int idade = entrada.nextInt();
	
	
	//              expressão booleana               caso seja verdadeiro                      caso seja falso
	String indicação = (idade >= 18)         ?       "adulto"                  :          (idade<=12)?     "criança" : "adoslecente";
	
	//int x = (idade>=18) ? 1:2;
	
//	if(idade >= 18) {
//		indicação = "Adulto";
//	}else {
//		indicação = "criança/adolescente";
//	}
	
	System.out.println("Resultado" + indicação);
	
}
	
}
