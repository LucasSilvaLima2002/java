package br.com.fiap;

public class RPG {
public static void main(String[] args) {
		
	Jogador geralt = new Jogador("Geralt");
	System.out.println("XP = " + geralt.getxp());
	System.out.println("HP = " + geralt.gethp());

	if (geralt.isEnvenenado()) {
		System.out.println("Est� envenenado");
	}
	else {
		System.out.println("N�o est� envenenado");
	}
	
	geralt.receberDano(10);
	System.out.println("HP = " + geralt.gethp());
	
	geralt.receberCura(10);
	System.out.println("HP = " + geralt.gethp());
	
	geralt.ganharExperiencia(50);
	System.out.println("XP = " + geralt.getxp());
	
	geralt.receberAntidoto();
	
	if (geralt.isEnvenenado()) {
		System.out.println("Est� envenenado");
	}
	else {
		System.out.println("N�o est� envenenado");
	}
	
	
	}
}
