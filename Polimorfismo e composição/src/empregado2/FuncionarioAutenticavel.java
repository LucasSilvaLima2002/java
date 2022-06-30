package empregado2;

public abstract interface FuncionarioAutenticavel {


	public boolean autenticar(String senha);

	public void setSenha(String senha);
}
