package fiap.com.br;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String nome;
	private float saldo;
	private boolean status;

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float Saldo) {
		this.saldo = Saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void ContaBanco() {
		saldo = 0;
       status = false;
       
	}

	public void abrirConta(String t) {

		this.setTipo(t);
	
		if(t == "CC") {
			this.setSaldo(50);
			this.setStatus(true);
		}else if (t == "CP"){
			this.setSaldo(150);
			this.setStatus(true);
		}
	System.out.println("Conta aberta com sucesso");
		}


	public void fecharConta() {
		if (this.getSaldo()>0) {
			System.out.println("Precisa sacar o dinheiro primeiro");
		}
		if (this.getSaldo()<0) {
			System.out.println("Esta devendo dinheiro então não pode sacar");
		}else {
			this.setStatus(false);
		System.out.println("Conta fechada com sucesso");}
	}

	public void depositar(float v) {
		if (this.getStatus() == true) {
			this.setSaldo(this.getSaldo()+ v);
			System.out.println("Deposito realizado com sucesso na conta de  "+ this.getNome()); 
		} else {
			System.out.println("A conta esta fechada");
		}
	}

	public void sacar(float v) {
	if (getStatus()) {
		if(this.getSaldo()>=v) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Saque realizado na conta de " + this.getNome());
		}
		else {
			System.out.println("Saldo insuficiente para saque");
		}
	}else {
		System.out.println("Conta não esta ativa");
	}
	}
	public void pagarMensalidade() {
		int v = 0;
		if (this.getTipo()=="cc") {
			v = 12;
		}
		if (this.getTipo() == "cp") {
			v = 20;
		}
		if(this.getStatus()) {
			this.setSaldo(getSaldo()-v);
			System.out.println("Mensaliade paga com sucesso por " + this.getNome());
		}else {
			System.out.println("Conta fechada");
		}

	}
	public void estadoAtual() {
		System.out.println("-------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
	}

}
