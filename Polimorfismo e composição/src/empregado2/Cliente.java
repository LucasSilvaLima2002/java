package empregado2;

public class Cliente implements FuncionarioAutenticavel{

	private String senha;

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}
	
	

}
