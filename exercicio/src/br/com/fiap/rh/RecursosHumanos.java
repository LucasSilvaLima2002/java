package br.com.fiap.rh;

public class RecursosHumanos {
	
public static void main(String[] args) {
	
	Engenheiro engenheiro = new Engenheiro();
	engenheiro.setSalarioBase(5000);
	System.out.println("O salario do engenheiro é igual a " + engenheiro.calcularSalario1());
	
	Presidente presidente = new Presidente();
	presidente.setValorDasCotas(10000);
	presidente.setSalarioBase(8000);
	System.out.println("O salario do presidente é igual a " + presidente.calcularSalario());
	
	
    FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
    folhaDePagamento.registrar(presidente, engenheiro);
    System.out.println(folhaDePagamento.getPagamentoTotal());
    
    Funcionario_Autenticavel funcionario = new Funcionario_Autenticavel();
    System.out.println(engenheiro.getFuncionario().autenticar("123456"));
  
   
}
}
  
    
