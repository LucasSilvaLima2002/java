package fiap.com.br;

public class Campeao {


	private String Q;
	private String W;
	private String E;
	private String R;
	private String regi�o;
	private String rota;
	
	
	
	public String getQ() {
		return Q;
	}
	
	public void setQ(String q) {
		Q = q;
	}
	
	public String getW() {
		return W;
	}
	
	public void setW(String w) {
		W = w;
	}
	
	public String getE() {
		return E;
	}
	
	public void setE(String e) {
		E = e;
	}
	
	public String getR() {
		return R;
	}
	
	public void setR(String r) {
		R = r;
	}
	
	public String getRegi�o() {
		return regi�o;
	}
	
	public void setRegi�o(String regi�o) {
		this.regi�o = regi�o;
	}
	
	public String getRota() {
		return rota;
	}
	
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public void comparar() {
		
		System.out.println("Skill Q: " + Q);
		System.out.println("Skill W: " + W);
		System.out.println("Skill E: " + E);
		System.out.println("Skill R: " + R);
		System.out.println("Regi�o: " + regi�o);
		
		
	
		if(this.regi�o == "Shurima") {
			System.out.println("O campeao � o rammus");}
		if(this.regi�o == "Runeterra") {
			System.out.println("O campeao � o zilean");}
		if(this.regi�o == "Freljord") {
			System.out.println("O campeao � o Gragas");}
		if(this.regi�o == "Noxus" && this.R == "Reta da morte") {
			System.out.println("O campeao � o draven");}
		else {
			System.out.println("O campeao � o swain");}
	}
	}
	
//zilean,draven,swain,rammus,gragas//

