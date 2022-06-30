package Capitulo3;

public class Carro {

    String fabricante;
	String modelo;
	String cor;
	int anoDeFabricação;
	
	//tem um proprietario
	Proprietario dono;
	
	//baixa coesão
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
