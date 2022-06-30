package aula07;
import java.util.Random;

public class Fight {
	
	private Campeao Lutador1;
	private Campeao Lutador2;
	private boolean aprovada;

	public void marcarLuta(Campeao c1, Campeao c2) {
		if(c1.getClasse() == c2.getClasse() && c1 != c2) {
			this.aprovada = true;
			this.Lutador1=c1;
			this.Lutador2=c2;
		
			System.out.println("A luta foi aprovada");
		}else {
			System.out.println("A luta não pode ser aprovada ");
		}
	}
	public void lutar() {
		
		if(this.aprovada == true) {
			
			System.out.println("LUTADOR NUMERO 1");
			this.Lutador1.apresentar();
			System.out.println("LUTADOR NUMERO 2");
			this.Lutador2.apresentar();
			
			  Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0:
				System.out.println("Empate ");
				this.Lutador1.empatarLuta();
				this.Lutador2.empatarLuta();
			break;
			case 1:
				System.out.println("Vitoria do " + this.Lutador1.getNome());
				this.Lutador1.ganharLuta();
				this.Lutador2.perderLuta();
			break;
			case 2:
				System.out.println("Vitoria do " + this.Lutador2.getNome());
				this.Lutador1.ganharLuta();
				this.Lutador2.perderLuta();
			break;
			}
		}
		
	}
	
	
}
