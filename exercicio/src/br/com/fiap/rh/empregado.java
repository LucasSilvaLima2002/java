package br.com.fiap.rh;

public abstract class empregado {

	private int codigo;
	private String nome;
	private double salarioBase;
	
	private Funcionario_Autenticavel funcionario;
 

	public Funcionario_Autenticavel getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario_Autenticavel funcionario) {
		this.funcionario = funcionario;
	}

	
	public double calcularSalario1() {
		return getSalarioBase() * 1.5;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double calcularSalario() {
		return salarioBase;
	}

}
