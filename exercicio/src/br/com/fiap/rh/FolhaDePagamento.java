package br.com.fiap.rh;

public class FolhaDePagamento {

	private double pagamentoTotal = 0;
	
	public void registrar(Presidente presidente, Engenheiro engenheiro) {
		 pagamentoTotal += presidente.calcularSalario();
		 pagamentoTotal += engenheiro.calcularSalario();
	}
	
	
	public double getPagamentoTotal() {
		return pagamentoTotal;
	}
}

