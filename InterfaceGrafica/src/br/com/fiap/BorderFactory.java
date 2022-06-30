package br.com.fiap;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public abstract class BorderFactory { //Design Pattern
	
	public static Border create() {
		
		return new LineBorder(new Color(0,0,255));
	}

}
