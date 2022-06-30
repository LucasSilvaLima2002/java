package br.com.fiap;

import javax.swing.JOptionPane;

public class Jogador {
	private String nome;
	private  int xp;
	private  int hp;
	private  boolean envenenado;
	
	public  Jogador() {
	this.xp = 0;
	this.hp = 100;
	this.envenenado = false;
	}
	
	public  Jogador(String nome) {
	this.nome = nome;
	this.xp = 0;
	this.hp = 100;
	this.envenenado = false;
	}
	public int getxp() {
	return this.xp;
	}
	public int gethp() {
	return this.hp;
	}
	public boolean isEnvenenado() {
	return this.envenenado;
	}
	public void receberDano(int pontos) {
		this.hp -= pontos;
		if (this.hp <=0) {
		JOptionPane.showMessageDialog(null, "GAME OVER");
		}
	}
		public void receberCura(int pontos) {
			this.hp += pontos;
	}
		public void ganharExperiencia(int pontos) {
			this.xp += pontos;
		}
		public void receberAntidoto() {
			this.envenenado =! this.envenenado;
		}
}
			
	
	
