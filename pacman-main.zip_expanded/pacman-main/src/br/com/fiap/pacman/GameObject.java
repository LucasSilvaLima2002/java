package br.com.fiap.pacman;


public class GameObject {

	private int x;
	private int y;
	private int size;

	public GameObject() {
		this.x = 0;
		this.y = 0;
	}
	
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getScreenSize() {
		return this.size;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setScreenSize(int size) {
		this.size = size;
	}
	
		
}
