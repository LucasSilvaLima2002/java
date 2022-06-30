package Capitulo3;

public class PacientePrincipal {
	public static void main(String[] args) {
		
		Paciente p = new Paciente();
		p.peso = 70.5;
		p.altura = 1.75;
		
		p.teste();
		
		double imcCalculado = p.calcularIndiceDeMassaCorporal();
		
		System.out.println(imcCalculado);
		
		IMC imc = p.calcularIndiceDeMassaCorporal1();
		
		System.out.println("Abaixo do peso ideal " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal " + imc.pesoIdeal);
		System.out.println("Obeso " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauDeObesidade);
		System.out.println(imc.indice);
	}

}
