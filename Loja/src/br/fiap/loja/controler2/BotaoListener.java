package br.fiap.loja.controler2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

import br.com.fiap.loja.dao.ProdutoDao;
import br.com.fiap.model2.Produto;
import br.fiap.loja.view2.Janela;

public class BotaoListener implements ActionListener{
	
	private Janela view;


	public BotaoListener(Janela view) {
		this.view = view;
		
		
	}

	
	
	
	public void actionPerformed(ActionEvent e) {
	
		Produto produto = new Produto();
		produto.setNome(view.getTxtNome().getText());
		produto.setDescricao(view.getTxtDescricao().getText());
		produto.setPreço(new BigDecimal(view.getTxtPreco().getText()) );
         
		new ProdutoDao().inserir(produto);
	}

	
	
	

}
