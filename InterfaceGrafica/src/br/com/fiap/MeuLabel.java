package br.com.fiap;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MeuLabel extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MeuLabel(){
		init();
	}
	
	public MeuLabel(String text) {
		this.setText(text);
		init();
		
	}
private void init() {
	this.setForeground(new Color(255,0,150));
			this.setBackground(Color.BLUE);
			this.setBorder(new LineBorder(new Color(0,0,255)));
}
}
