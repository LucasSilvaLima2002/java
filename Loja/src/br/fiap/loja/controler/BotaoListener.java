package br.fiap.loja.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;
import br.fiap.loja.model.Produto;
import br.fiap.loja.view.Janela;

// MVC

public class BotaoListener implements ActionListener{

	private Janela view;
	
	public BotaoListener(Janela view) {
		this.view = view;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Produto produto = new Produto();
		produto.setNome(view.getTxtNome().getText());
		produto.setDescri��o(view.getTxtDescri��o().getText());
		produto.setPre�o(new BigDecimal(view.getTxtPreco().getText()));

		
		JOptionPane.showMessageDialog(null, produto);
		
	}
	
	
	
	

}
