package aula03;

public class Caneta {
public String modelo;
private float ponta;
private boolean tampada;
private String cor;

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
	
}

public float getPonta() {
	return ponta;
}

public void setPonta(float ponta) {
	this.ponta = ponta;
}

public  Caneta(String m, String c, float p) {
	this.tampar();
	this.modelo = m;
	this.cor = c;
	this.ponta = p;
	
}

public void tampar() {
	this.tampada = true;	
	
}
public void destampar() {
	this.tampada = false;
}

public void Status() {
	System.out.println("Sobre a caneta ");
	System.out.println("Modelo: " + this.modelo);
	System.out.println("Ponta: " + this.ponta);
	System.out.println("Esta tampada? " + this.tampada);
	System.out.println("Cor: " + this.cor);
	
}

}
