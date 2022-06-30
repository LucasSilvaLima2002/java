package fiap.com.br;

public class Taxi {

	private String modelo;
	private float preço;
	private String cor;
	private String documentação;

	public String getModelo() {
		return modelo;

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;

	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDocumentação() {
		return documentação;
		
		
	}

	public void setDocumentação(String documentação) {

		this.documentação = documentação;
	}
	
	public void informações() {
		if(this.documentação == "Não") {
			System.out.println("A documentação não esta em dia");
		}
		else {
			System.out.println("Informações do carro");
			setCor("Branco");
			setPreço(10.000f);
			System.out.println("Cor:" + getCor());
			System.out.println("Preço:" + getPreço());
			System.out.println("Modedo: " + this.modelo);
			
			
			
		}
			
	}

}
