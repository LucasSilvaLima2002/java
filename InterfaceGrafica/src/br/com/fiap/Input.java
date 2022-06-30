package br.com.fiap;

import java.awt.Color;

import javax.swing.JTextField;

public class Input extends JTextField {

	public Input() {
		super(20);
		init();
	}

	private void init() {
		this.setForeground(new Color(0,50,0));
		this.setBackground(Color.GREEN);
this.setBorder(BorderFactory.create());
	}
	
	
}
