package aula1;

public class CarroTestar {
public static void main(String[] args) {
	Carro c1 = new Carro();
	
	c1.nome = "Uno";
	c1.marca = "Fiat";
	c1.ano = 2015;
	c1.velocidade = 100;
	
	System.out.println("A velocidade do carro é igual a " + c1.velocidade + " km/h");
	
	c1.acelerar(10);
	System.out.println("A velocidade do carro é igual a " + c1.velocidade + " km/h");
	
	c1.frear(10);
	System.out.println("A velocidade do carro é igual a " + c1.velocidade + " km/h");
	
	c1.buzinar();

}
}
