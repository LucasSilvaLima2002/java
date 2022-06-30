package Capitulo2;

public class ConversaoTipoPrimitivo {
	public static void main(String[] args) {
		
	
	long x = 9300000000L;
	int b = 102344;
	double a = 20.5;
	float c = 935.5f;
	double largura = 100;
	
	int j = (int)largura;		
	double u = (double)c;
	float h = (float)a;
	long v = (long)b;
	int y = (int)x;
	//perde precisão
	System.out.println(y);
	System.out.println(v);
	System.out.println(h);
	System.out.println(c);
	System.out.println(j);
	
	//https://www.scientecheasy.com/2020/07/type-conversion-casting-java.html/
	}
}
