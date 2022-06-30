package br.fiap.loja.view2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.fiap.loja.controler2.BotaoListener;

public class Janela extends JFrame{
	
	
	private JTextField txtNome = new JTextField(20); //objeto do tipo jtextfield tamanho 20
	private JTextArea txtDescricao = new JTextArea(3,20);//Nao esquecer a diferença de TextArea de JTextArea
	private JTextField txtPreco = new JTextField(20); //objeto do tipo jtextfield tamanho 20
	private JButton btnSalvar = new JButton("Salvar");
	
		
	
	
	public Janela() {
		setLayout(new FlowLayout());
		setSize(330,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
	public void init(){
		
		add(new JLabel("Nome"));
		add(txtNome);
		
		add(new JLabel("Descrição"));
		add(txtDescricao);
		
		add(new JLabel("Preço"));
		add(txtPreco);
	
		add(btnSalvar);
		BotaoListener listener = new BotaoListener(this);
		btnSalvar.addActionListener(listener);
		//design patterns = soluções comuns para problemas recorrentes de POO
		//observer
		
		
		
	}


	public JTextField getTxtNome() {
		return txtNome;
	}


	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}


	public JTextArea getTxtDescricao() {
		return txtDescricao;
	}


	public void setTxtDescricao(JTextArea txtDescricao) {
		this.txtDescricao = txtDescricao;
	}


	public JTextField getTxtPreco() {
		return txtPreco;
	}


	public void setTxtPreco(JTextField txtPreco) {
		this.txtPreco = txtPreco;
	}

}
