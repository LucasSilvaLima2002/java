package br.com.fiap.pacman;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Ghost extends GameObject{

	private int direction;

	Timer timer = new Timer();
	public Ghost() {
		super();
		this.direction = 0;
		this.aleatoriamente();
	}
	
	public Ghost(int x, int y, int direcao) {
		super(x, y);
		this.direction = direcao;
		this.aleatoriamente();
	}
	
	public void setDirection(int direction)	{
		this.direction = direction;
	}
	
	public boolean canMove() {
		int pos_ant;
		
		if (this.direction == 90 || this.direction == 270)
			pos_ant = this.getX();
		else
			pos_ant = this.getY();
		
		return pos_ant + 10 >= 0 && pos_ant <= this.getScreenSize() + 40;
		
	}

	public void transport(){
		int x, y, screenSize;

		x = this.getX();
		y = this.getY();
		screenSize = this.getScreenSize();

		if (x == -20 && this.direction == 270) {
			this.setX(screenSize + 40);
		} else if (x == 650 && this.direction == 90) {
			this.setX(-10);
		}

		if (y == -20 && this.direction == 0) {
			this.setY(screenSize + 40);
		} else if (y == 650 && this.direction == 180) {
			this.setY(-10);
		}
	}

	
	public void move() {
		if (this.canMove()) {
			if (this.direction == 90) {
				this.setX(this.getX() + 10);
			}
			else if (this.direction == 270){
				this.setX(this.getX() - 10);
			}
			else if (this.direction == 0){
				this.setY(this.getY() - 10);
			}
			else if (this.direction == 180) {
				this.setY(this.getY() + 10);
			}
		} else {
			this.transport();
		}
	}

	public void aleatoriamente(){
		int delay = 2000;   
        int interval = 2000;  
		int[] directions = {0, 90, 180, 270};

		Random random = new Random();    

		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				direction = directions[random.ints(0, 4)
				.findFirst()
				.getAsInt()];
				setDirection(direction);         
			}
			}, delay, interval);
	}
}

