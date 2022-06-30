package fiap.com.br;

public class TaxiTeste {
	public static void main(String[] args) {
		Taxi pessoa1 = new Taxi();
		//System.out.println("A sua documentação esta em dia?");
		pessoa1.setDocumentação("Sim");
		//System.out.println("Digite o modelo do carro");
		pessoa1.setModelo("Fiat");
		pessoa1.informações();
		
	}

}
