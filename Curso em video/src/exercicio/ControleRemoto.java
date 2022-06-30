package exercicio;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {

		this.setVolume(50);
		this.ligado = false;
		this.tocando = false;

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {

		this.setLigado(true);;

	}

	@Override
	public void desligar() {

		this.setLigado(false);

	}

	@Override
	public void abrirMenu() {
		System.out.println("-----MENU----- ");
		System.out.println("Esta ligado? " + this.isLigado());
		System.out.println("Esta tocando? " + this.isTocando());
		System.out.println("Volume " + this.getVolume());
		for (int i = 0; i < this.getVolume(); i++) {
			System.out.println("|");
		}

	}

	@Override
	public void fecharMenu() {

		System.out.println("Fechando o menu... ");

	}

	@Override
	public void maisVolume() {

		if (this.isLigado() == true && this.isTocando() == true) {

			this.setVolume(this.getVolume() + 5);

		}

		if (this.isLigado() == false) {

			System.out.println("Impossivel auentar o som com a TV desligada");

		}
		// impossivel aumentar o som no maximo

	}

	@Override
	public void menosVolume() {

		if (this.isLigado() == true && this.isTocando() == true) {

			this.setVolume(this.getVolume() - 5);

		}
		if (this.ligado == false) {

			System.out.println("Impossivel diminuir o som com a TV desligada");
		}
	}

	@Override
	public void ligarMudo() {

		if (this.isLigado() == true && this.getVolume() > 0) {

			this.setVolume(0);

		} else {

			System.out.println("A TV ja está no mudo");
		}

	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() == true && this.getVolume() == 0) {
			
			this.setVolume(50);
			
		}
	}

	@Override
	public void play() {
		
		if (this.isLigado() == true && !this.isTocando()) {
			
			this.setTocando(true);
		}

	}

	@Override
	public void pause() {
		if (this.isLigado() == true && this.isTocando() == true) {
			
			this.setTocando(false);
			
		}
	}

}
