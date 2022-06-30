
public class Player extends GameObject{
	private int direction;
	private int life;
	private boolean invencible;


	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public Player(int x, int y,int screenSize, int direction) {
		super(x, y,screenSize);
		this.direction = direction;
		// TODO Auto-generated constructor stub
	}

	
	public Player(int x, int y,int direction) {
		super(x,y, direction);
		this.direction = direction;
		
		public void Move() {
			while(this.canMove()) {
				if (this.direction == 90 || this.direction == 270)
					this.setX(this.getX() + 10);
				else
					this.setY(this.getY() + 10);
			}
		}
	}
	
	

}