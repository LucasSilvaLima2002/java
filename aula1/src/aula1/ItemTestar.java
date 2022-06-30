package aula1;

public class ItemTestar {
	public static void main(String[] args) {
		
	
	Item p1 = new Item();
	p1.nome = "Salgadinho";
	p1.marca = "Fofura";
	p1.valor = 0.50f;

	Item p2 = new Item("Pão de alho" , "Swift");

	Item p3 = new Item("Borracha" , "SUS" , 1.8f);

	System.out.println("Nome: " + p1.nome + "/ Marca: " + p1.marca + "/ Valor : " + p1.valor);
	
	System.out.println("Nome: " + p2.nome + "/ Marca: " + p2.marca + "/ Valor : " + p2.valor);
	
	System.out.println("Nome: " + p3.nome + "/ Marca: " + p3.marca + "/ Valor : " + p3.valor);
}
}
