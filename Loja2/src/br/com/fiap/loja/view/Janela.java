package br.com.fiap.loja.view;

import java.awt.FlowLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import br.com.fiap.loja.controller.BotaoListener;
import br.com.fiap.loja.controller.TableListener;
import br.com.fiap.loja.dao.ProdutoDao;
import br.com.fiap.loja.model.Produto;

public class Janela extends JFrame{
	
	 
	 String[] colunas = {"id","nome","descri��o","pre�o"};
	 DefaultTableModel tableModel = new DefaultTableModel(colunas,0);
	 JTable tabela = new JTable(tableModel);
	
	private JTabbedPane abas = new JTabbedPane();
	private JPanel painelCadastro = new JPanel();
	private JTextField txtNome = new JTextField(20);
	private JTextArea txtDescricao = new JTextArea(3,20);
	private JTextField txtPreco = new JTextField(20);
	private JButton btnSalvar = new JButton("Salvar");
	
	public JTextField getTxtNome() {
		return txtNome;
	}
	public JTextArea getTxtDescricao() {
		return txtDescricao;
	}
	public JTextField getTxtPreco() {
		return txtPreco;
	}
	
	public Janela() {
		setSize(330,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public void init() {
	painelCadastro.add(new JLabel("Nome"));
	painelCadastro.add(txtNome);
	painelCadastro.add(new JLabel("Descri��o"));
	painelCadastro.add(txtDescricao);
	painelCadastro.add(new JLabel("Pre�o"));
	painelCadastro.add(txtPreco);
	painelCadastro.add(btnSalvar);
	setVisible(true);
	carregarDados();
	TableListener tableListener = new TableListener();
	tabela.addMouseListener(tableListener);
	
		
	 
	 BotaoListener listener = new BotaoListener(this);
	 btnSalvar.addActionListener(listener);
	
	 
	 List<Produto> lista = new ProdutoDao().listarTodos();
	 lista.forEach(produto -> tableModel.addRow(produto.getData()));
	 

	 
	abas.add(painelCadastro,"Cadastro");
	abas.add(new JScrollPane(tabela), "Lista");
	add(abas);
}
	public void carregarDados() {
		
		tableModel.setRowCount(0);
		 List<Produto> lista = new ProdutoDao().listarTodos();
		 lista.forEach(produto -> tableModel.addRow(produto.getData()));
		 tabela.setDefaultEditor(Object.class, null);
	}
}