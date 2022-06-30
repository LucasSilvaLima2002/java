package aula3;

public class Aluno {
	private String nome;
	int idade;
	
	
public void setNome(String nome) {
	this.nome = nome;
}

public String getNome() {
 return nome;

}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	
	if	(idade>0 && idade<=20) {
		
	this.idade = idade;
	System.out.println("A idade foi cadastrada");
	
	}
	
	else {
		System.out.println("A idade não foi cadastrada");
	}
	
}

}
