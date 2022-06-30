import java.util.Scanner;

public class Bia {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

	int meses[] = new int[13];
	int qtdDia = 0;
	int dia;
	int mes;
	int ano;
	int diasComp = 0;
	int i = 0;
	int totalDias = 0;
	meses[0] = 31;
	meses[1] = 28;
	meses[2] = 31;
	meses[3]= 30;
	meses[4]= 31;
	meses[5] = 30;
	meses[6] = 31;
	meses[7]= 31;
	meses[8]= 30;
	meses[9] = 31;
	meses[10] = 30;
	meses[11] = 31;
	
	do {
		System.out.println("Digite dia");
		 dia = entrada.nextInt();
		System.out.println("Digite mes");
		 mes = entrada.nextInt();
		System.out.println("Digite ano");
		 ano = entrada.nextInt();
		
		if (dia == 0 && mes == 0 && ano == 0) {
	           break; //saida do loop
		}
		   if (ano < 1600) {
			   System.out.println("Ano invalido\n");}

	        if (mes < 0 || mes > 12) {
	        	System.out.println("Mes invalido\n");}


	        if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {//descobre se e ano bissexto
	                meses[1]+=1; //se for, soma 1 dia em fevereiro (i=1)}
	                
	                for (i=mes; i<12; i++) //descobre a qtd restante de dias ate o fim do ano (considerando o mes inteiro)
	                {
	                    qtdDia+=meses[i-1]; // subtrai o dia atual
	                }
	          
	                		 totalDias= (meses[i-1] - dia) + qtdDia;
	                
	                for (i = 0; i <= mes - 1; i++) //descobre a quantidade de dias desde o comeco do ano ate a data atual
	                {
	                     diasComp+= meses[i];
	                }
	}
	
	
	
	
	
	        if(dia >= meses[i] || dia < 1) {
	        	System.out.println("Dia invalido\n");}

	        System.out.println("Dias desde o inicio do ano " + diasComp + " dias até o fim do ano " + totalDias);
	        
	     
	
	} while (dia != 0 ||mes != 0 || ano != 0);
	
	}
	 
	}
