package aula02;

public class Caneta {
public String modelo;
public String cor;
private float ponta;
protected int carga;
protected boolean lampada;
private boolean tampada;

public void status() {
	System.out.println("Modelo " + this.modelo);
	System.out.println("Cor " + this.cor);
	System.out.println("Ponta " + this.ponta);
	System.out.println("Carga " + this.carga);
	System.out.println("Lampada " + this.lampada);
	System.out.println("Esta tampada? " + this.tampada);
	
}

public void escrever() {
	
}

public void rabiscar() {
	if(this.tampada == true) {
		System.out.println("Posso rabiscar");
	}else {
		System.out.println("Não posso rabiscar");
	}
	
}
public void pintar() {
	
}

public void tampar() {
	this.tampada = true;
}

public void destampar() {
	this.tampada = false;
	
}

}
