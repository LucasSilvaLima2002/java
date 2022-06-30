package br.com.fiap;

import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class MeuTextArea extends JTextArea{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int colunas = 30;
	private int linhas = 10;
	
	public MeuTextArea(){
		init();
	}

	private void init() {
	this.setColumns(colunas);
	this.setRows(linhas);
	this.setForeground(new Color(255,0,150));
	this.setBackground(Color.RED);

		
	}

}
