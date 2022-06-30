
public class GameObject {

	private int x;
	private int y;
	private int screenSize;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public GameObject(int x, int y, int screenSize) {
		super();
		this.x = x;
		this.y = y;
		this.screenSize = screenSize;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	

	

	
	
	
}
