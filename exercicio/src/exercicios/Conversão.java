package exercicios;

public class Conversão {
	
	private float c;
	private float ra;
	private float fa;
	private float re;
	private float k;
	
	public void convK() {
		
		 k = c + 273.15f;
		
		System.out.println(k);
		
	}
	
	public void conRe() {
		
		re = c * 0.8f;
		System.out.println(re);
		
	}
	
	public void conRa() {
		
		ra = c * 1.8f + 32f + 459.67f;
		System.out.println(ra);
		
	}
	public void conFa() {
		
		fa = c * 1.8f + 32f;
		System.out.println(fa);
		
	}

	public float getCelsius() {
		return c;
	}

	public void setCelsius(float celsius) {
		this.c = celsius;
	}

}
