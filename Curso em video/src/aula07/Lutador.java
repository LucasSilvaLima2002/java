package aula07;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categorias;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public  Lutador (String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		
		//pode usar as abreviações
	}
	
	
    public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getNacionalidade() {
		return nacionalidade;
	}






	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}





	public int getIdade() {
		return idade;
	}






	public void setIdade(int idade) {
		this.idade = idade;
	}






	public float getAltura() {
		return altura;
	}






	public void setAltura(float altura) {
		this.altura = altura;
	}






	public float getPeso() {
		return peso;
	}






	private void setPeso(float peso) {
		this.peso = peso;
		this.setCategorias();
	}






	public String getCategorias() {
		return categorias;
	}






	public void setCategorias() {
		if( this.peso < 52.2) {
			this.categorias = "Invalido";
		}else if(this.peso <= 70.3) {
			this.categorias = "Leve";
		}else if(this.peso <= 83.9) {
			this.categorias = "Médio";
		}else if(this.peso <= 120.2) {
			this.categorias = "Pesado";
		}else {
		     this.categorias = "Invalido";
		
		}
	}






	public int getVitorias() {
		return vitorias;
	}






	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}






	public int getDerrotas() {
		return derrotas;
	}






	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}






	public int getEmpates() {
		return empates;
	}



	
	

	public void setEmpates(int empates) {
		this.empates = empates;
	}




	public void apresentar() {

		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente de "+ this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos");
		System.out.println("Medindo " + this.altura + " de altura ");
		System.out.println("Pesando "+ this.getPeso()+ " quilos");
		System.out.println("Na categoria peso " + this.getCategorias());
		System.out.println("Possuindo " + this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println("e " + this.getEmpates()+ " empates");
		System.out.println("--------------------------------------------------------");
		
		
		
		
	}


	public void status() {
		System.out.println("--------------------------------------------------------");
		System.out.println(this.getNome() + " é um " + this.getCategorias());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
		
	}
	 
	public void ganharLuta() {
		
		this.setVitorias(this.getVitorias()+1);
		
		
	}
	
    public void perderLuta() {
    	
    	this.setDerrotas(getDerrotas()+1);
    
    }
	
    public void empatarLuta() {
    	
    	this.setEmpates(this.getEmpates()+1);
    	
    }
    
	
}
