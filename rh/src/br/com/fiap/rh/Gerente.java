package br.com.fiap.rh;

public class Gerente extends Empregado implements FuncionarioAutenticavel {

	private String area;
	private double bonus;
	private String senha;
	
	@Override
	public boolean autenticar(String senha) {
		if (this.senha == senha) {
			System.out.print("Logado");
			return this.senha == senha;
		} else {
			System.out.println("Erro Login");
			return this.senha == senha;
		}
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public double calcularSalario() {
		return getSalarioBase() + bonus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}

