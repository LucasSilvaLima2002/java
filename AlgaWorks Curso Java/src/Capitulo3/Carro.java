package Capitulo3;

public class Carro {

    String fabricante;
	String modelo;
	String cor;
	int anoDeFabrica��o;
	
	//tem um proprietario
	Proprietario dono;
	
	//baixa coes�o
//	String nomeDoProprietario;
//	String cpfDoProprietario;
//	int idadeProprietario;
//	String logradouroProprietario;
	
	void ligarCarro() {
		
		if(modelo == null) {
			return;
		}
	System.out.println("Ligando carro: " + modelo);
	
	}
	
}
