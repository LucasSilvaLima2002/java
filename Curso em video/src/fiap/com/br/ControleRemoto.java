package fiap.com.br;

public class ControleRemoto implements Controlador {

	private int volume;

	private boolean ligado;

	private boolean tocando;

	public ControleRemoto() {

		this.volume = 50;
		this.ligado = false;
		this.tocando = false;

	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {

		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private  void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// metodos abstratos

	public void ligar() {

		this.setLigado(true);

	}

	public void desligar() {

		this.setLigado(false);

	}

	public void abrirMenu() {
        System.out.println("-----MENU----- ");
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta tocando? " + this.getLigado());
		System.out.println("Volume " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.println("|");
		}

	}

	public void fecharMenu() {

		System.out.println("Fechando Menu... ");

	}

	public void maisVolume() {

		if (this.getLigado() == false) {

			System.out.println("Impossivel aumentar o volume com a TV desligada ");}
		
		if(this.getVolume() >=100) {
		
			
			System.out.println("Impossivel aumentar o som, ja está no máximo ");
		}else {
			this.setVolume(this.getVolume() + 5);
		}

	}

	public void menosVolume() {

		if (this.getLigado() == false) {
			
			System.out.println("Impossivel diminuir o volume com a TV desligada ");
		}	
		if(this.getVolume() <=0) {
		
			
			System.out.println("Impossivel diminuir o som, ja está no minimo ");

	}else {
		this.setVolume(this.getVolume() - 5);
	}
	}

	public void ligarMudo() {

		if (this.getLigado() && this.getVolume() > 0) {

			this.setVolume(0);
		}else {
			System.out.println("A TV ja esta no mudo ");
		}

	}

	public void desligarMudo() {

		if (this.getLigado() && this.getVolume() == 0) {

			this.setVolume(50);

		}

	}

	public void play() {

		if (this.getLigado() && !this.getTocando()) {

			this.setTocando(true);

		}

	}

	public void pause() {

		if (this.getLigado() && this.getTocando()) {

			this.setTocando(false);

		}

	}

}
