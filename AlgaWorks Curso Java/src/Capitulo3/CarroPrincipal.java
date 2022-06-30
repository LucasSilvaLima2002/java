package Capitulo3;

public class CarroPrincipal {
	public static void main(String[] args) {
		
	    Carro Meucarro = new Carro();
	    Meucarro.anoDeFabricação = 2011;
	    Meucarro.modelo = "Palio";
	    Meucarro.fabricante = "Fiat";
	    Meucarro.cor = "Prata";
	    
	    Carro Seucarro = new Carro();
	    Seucarro.anoDeFabricação = 2009;
	    Seucarro.modelo = "Civic";
	    Seucarro.fabricante = "Honda";
	    Seucarro.cor = "Preto";
	    Seucarro.dono = new Proprietario();
	    Seucarro.dono.nome = "Rogerio Rocha";
	    Seucarro.dono.cpf = "111.111.111-00";
	    Seucarro.dono.idade = 30;
	    Seucarro.dono.logradouro = "Rua Jose Calcanhar, 30";
	    Seucarro.dono.bairro = "Sul";
	    Seucarro.dono.cidade = "São Paulo";
	
	    
	    
	    Carro Meucarro1;
	    Meucarro1 = new Carro();
	    
	    Proprietario dono1 = new Proprietario();
	    dono1.nome = "João da Silva";
	    dono1.cpf = "000.000.000-00";
	    dono1.idade = 25;
	    dono1.logradouro = "Rua João Pinheiros, 10";
	    dono1.bairro = "Centro";
	    dono1.cidade = "Uberlandia";
	    Meucarro.dono = dono1;
	    
	    System.out.println(dono1);
	    System.out.println(dono1.nome);
	    System.out.println("----------------MEU CARRO----------------");
	    System.out.println("Dono: " + Meucarro.dono.nome);
	    System.out.println("cpf: " + Meucarro.dono.cpf);
	    System.out.println("Idade: " + Meucarro.dono.idade);
	    System.out.println("Logradouro: " + Meucarro.dono.logradouro);
	    System.out.println("Bairro: " + Meucarro.dono.bairro);
	    System.out.println("Cidade: " + Meucarro.dono.cidade);
	    System.out.println("Modelo: " + Meucarro.modelo);
	    System.out.println("Ano: " + Meucarro.anoDeFabricação);
	    System.out.println("Fabricante: " + Meucarro.fabricante);
	    System.out.println("Cor: " + Meucarro.cor);
	    Meucarro.ligarCarro();
	    System.out.println(Seucarro.dono);
	    
	   
	    System.out.println("----------------SEU CARRO----------------");
	    System.out.println("Dono: " + Seucarro.dono.nome);
	    System.out.println("cpf: " +  Seucarro.dono.cpf);
	    System.out.println("Idade: " +  Seucarro.dono.idade);
	    System.out.println("Logradouro: " +  Seucarro.dono.logradouro);
	    System.out.println("Bairro: " +  Seucarro.dono.bairro);
	    System.out.println("Cidade: " +  Seucarro.dono.cidade);
	    System.out.println("Modelo: " + Seucarro.modelo);
	    System.out.println("Ano: " + Seucarro.anoDeFabricação);
	    System.out.println("Fabricante: " + Seucarro.fabricante);
	    System.out.println("Cor: " + Seucarro.cor);
	    Seucarro.ligarCarro();
	    
		
		
	}

}
