package Capitulo3Exercicios;

public class ExercicioCachorroPetShop {
	public static void main(String[] args) {
		
		ExercicioCachorro cachorro = new ExercicioCachorro();
		
		cachorro.nome = "Bidu";
		cachorro.idade = 1;
		cachorro.ra�a = "Boxer";
		cachorro.sexo = 'M';
		
		System.out.println("Informa��es do " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Ra�a: " + cachorro.ra�a);
		System.out.println("Sexo: " + cachorro.sexo);
		
	}

}
