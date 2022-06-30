package Capitulo2;

public class OperadorDeIncrimentoEDecremento {

public static void main(String[] args) {
	

	int x = 10;
	int y = 10;
	int idade = 10;
	
	idade = idade + 1;
	idade += 1;
	idade++;
	
	int novaIdade2 = ++y;
	int novaIdade = x++;
	
	System.out.println(novaIdade);
	System.out.println(novaIdade2);
}	
	

}
