import java.util.Scanner;

public class Calculo {
public static void main(String[] args) {
	
	int vetor[] = new int[13];
	int i = 0;
	int teste = 0;
	
	vetor[1] = 31;
	vetor[2] = 28;
	vetor[3] = 31;
	vetor[4] = 30;
	vetor[5] = 31;
	vetor[6] = 30;
	vetor[7] = 31;
    vetor[8] = 31;
	vetor[9] = 30;
	vetor[10] = 31;
	vetor[11] = 30;
	vetor[12] = 31;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("O ano é bissexto? ");
	int pergunta = entrada.nextInt();
	
	if(pergunta == 1) {
		vetor[2] = 29;
	}
	System.out.println("Qual o dia?");
	int dia = entrada.nextInt();
	System.out.println("Qual o mes?");
	int mes = entrada.nextInt();
	
	int dias =vetor[mes] - dia;
     teste = dias;

	
	for(i = mes +1 ;i<=12;i++) {
	 dias +=  vetor[i]; 
	}
	System.out.println(dias);
	
	dia -= 1;
	for(i = 1; i<mes;i++) {
		dia += vetor[i];
	}
    System.out.println(dia);
	
}
}
