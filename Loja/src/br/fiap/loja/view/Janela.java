package br.fiap.loja.view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.fiap.loja.controler.BotaoListener;

public class Janela extends JFrame{
	
	private JTextField txtNome = new JTextField(20); 
	private JTextArea txtDescri��o = new JTextArea(3, 20);
	private JTextField txtPreco = new JTextField(20);
	private JButton btnSalvar = new JButton("Salvar");
	
	public Janela() {
		setLayout(new FlowLayout());
		setSize(330,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void init() {
		add(new JLabel("Nome"));
		add(txtNome);
		add(new JLabel("Descri��o"));
		add(txtDescri��o);
		add(new JLabel("Pre�o"));
		add(txtPreco);
		add(btnSalvar);
		setVisible(true);
        BotaoListener listener = new BotaoListener(this);
		btnSalvar.addActionListener(listener);
		
		//design pattern
		//observer
		
		
		
		
		
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextArea getTxtDescri��o() {
		return txtDescri��o;
	}

	public void setTxtDescri��o(JTextArea txtDescri��o) {
		this.txtDescri��o = txtDescri��o;
	}

	public JTextField getTxtPreco() {
		return txtPreco;
	}

	public void setTxtPreco(JTextField txtPreco) {
		this.txtPreco = txtPreco;
	}

	
}
