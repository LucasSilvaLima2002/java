package fiap.com.br;

public class Taxi {

	private String modelo;
	private float pre�o;
	private String cor;
	private String documenta��o;

	public String getModelo() {
		return modelo;

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;

	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDocumenta��o() {
		return documenta��o;
		
		
	}

	public void setDocumenta��o(String documenta��o) {

		this.documenta��o = documenta��o;
	}
	
	public void informa��es() {
		if(this.documenta��o == "N�o") {
			System.out.println("A documenta��o n�o esta em dia");
		}
		else {
			System.out.println("Informa��es do carro");
			setCor("Branco");
			setPre�o(10.000f);
			System.out.println("Cor:" + getCor());
			System.out.println("Pre�o:" + getPre�o());
			System.out.println("Modedo: " + this.modelo);
			
			
			
		}
			
	}

}
