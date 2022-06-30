package aula07;

public class Campeao {

	private String nome;
	private String classe;
	private String rota;
	private int vitoria;
	private int derrota;
	private int empate;
	


	public  Campeao(String nome,String classe,String rota) {
		
		this.nome = nome;
		this.classe = classe;
		this.rota = rota;
		
	}
	
	public void apresentar() {
		

		System.out.println("Nome: " + this.getNome());
		System.out.println("Rota: " + this.getRota());
		System.out.println("Classe: " + this.getClasse());
		System.out.println("Vitorias: " + this.getVitoria());
		System.out.println("Derrotas: " + this.getDerrota());
		System.out.println("Empates: " + this.getEmpate());
		System.out.println("--------------------------------------------------------");
		
	}
	
	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		derrota = derrota;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		empate = empate;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public void ganharLuta() {
		
		this.vitoria += 1;
		
	}
	public void perderLuta() {
		
		this.derrota += 1;
		
	}
	public void empatarLuta() {
		
		this.empate += 1;
	}
	
}
