package Capitulo3Exercicios;

public class ExercicioCachorroPetShop {
	public static void main(String[] args) {
		
		ExercicioCachorro cachorro = new ExercicioCachorro();
		
		cachorro.nome = "Bidu";
		cachorro.idade = 1;
		cachorro.raça = "Boxer";
		cachorro.sexo = 'M';
		
		System.out.println("Informações do " + cachorro.nome);
		System.out.println("Idade: " + cachorro.idade);
		System.out.println("Raça: " + cachorro.raça);
		System.out.println("Sexo: " + cachorro.sexo);
		
	}

}
