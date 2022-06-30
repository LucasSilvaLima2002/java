package Teste;

import java.util.Scanner;

public class Media {
public static void main(String[] args) {
	
	float nota1[] = new float [3];
	float nota2[] = new float [3];
	String nome[] = new String[3];
	float media[] = new float [3];
	int i = 0;
	float x = 0;
	float x1= 0;
	String p1 = "";
	String p = "";
	
	Scanner entrada = new Scanner(System.in);
	
	
	for(i=0;i<3;i++) {
	System.out.println("Digite o nome do aluno");
    nome[i] = entrada.next();
	System.out.println("Digite a nota 1 do aluno");
	nota1[i] = entrada.nextInt();
   System.out.println("Digite a nota 2 do aluno");
   nota2[i] = entrada.nextInt();
	media[i] = (nota1[i] + nota2[i])/2;
	}
	
	

	for(i=0;i<3;i++) {
		if(x<media[i]) {
		 x = media[i];
		p = nome[i];
		}
		for(i=0;i<3;i++) {
		if(x1<=media[i]) {
			x1=media[i];
			p1=nome[i];
		}
		}
	}
	
	

	System.out.println("Aluno com a maior media: " + p + " nota: " + x);
	if(p1 != p) {
	System.out.println("Segundo luno com a maior media: " + p1 + " nota: " + x1);
	}
	
	
	
	
	
}
}
