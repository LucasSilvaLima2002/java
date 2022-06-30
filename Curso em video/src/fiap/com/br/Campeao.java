package fiap.com.br;

public class Campeao {


	private String Q;
	private String W;
	private String E;
	private String R;
	private String região;
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
	
	public String getRegião() {
		return região;
	}
	
	public void setRegião(String região) {
		this.região = região;
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
		System.out.println("Região: " + região);
		
		
	
		if(this.região == "Shurima") {
			System.out.println("O campeao é o rammus");}
		if(this.região == "Runeterra") {
			System.out.println("O campeao é o zilean");}
		if(this.região == "Freljord") {
			System.out.println("O campeao é o Gragas");}
		if(this.região == "Noxus" && this.R == "Reta da morte") {
			System.out.println("O campeao é o draven");}
		else {
			System.out.println("O campeao é o swain");}
	}
	}
	
//zilean,draven,swain,rammus,gragas//

