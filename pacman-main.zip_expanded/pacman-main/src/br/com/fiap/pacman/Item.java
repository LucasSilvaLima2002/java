package br.com.fiap.pacman;


public class Item extends GameObject{

	private boolean visible;

	public Item() {
		super();
		this.visible = false;
	}
	
	public Item(int x, int y) {
		super(x,y);
		this.visible = false;
	}
	
	public boolean getVisible() {
		return this.visible;
	}
	
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
