package aula3;

public class AlunoTestar {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
			aluno1.setNome("Lucas");
			System.out.println(aluno1.getNome());
			
		    aluno1.setIdade(20);
		    aluno1.setIdade(200);
		System.out.println(aluno1.idade);
	}

}
