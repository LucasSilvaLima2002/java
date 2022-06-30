package empregado2;

public class FolhaDePagamento  {

	private double pagamentoTotal = 0;

	public void registrar(Empregado empregado) {
		pagamentoTotal += empregado.calcularSalario();
	}

	public double getPagamentoTotal() {
		return pagamentoTotal;
	}
	public void logar(FuncionarioAutenticavel pessoa) {
		
		System.out.println(pessoa.autenticar("123456"));
		
	}
	
}
