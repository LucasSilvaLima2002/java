package Teste;

public class Trecho {
	public static void main(String[] args) {
		
	
	int v[] = {2,0,3,9};
	v[v[2]] = v[v[1]];
	//3 e 0
	for (int i : v) {
		System.out.println(v[i]);
	}
	
	
	}
}
