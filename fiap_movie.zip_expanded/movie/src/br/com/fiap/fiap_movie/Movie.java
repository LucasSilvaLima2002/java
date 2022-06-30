package br.com.fiap.fiap_movie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;

import java.util.Arrays;
import java.util.List;

public class Movie extends JFrame {
	public Movie() {
	}

	private JLabel i_filme = new JLabel(new ImageIcon("src/images/src.jpg"));

	private JLabel l_titulo = new JLabel("Titulo");
	private JTextField i_titulo = new JTextField();
	private JPanel p_titulo = new JPanel();

	private JLabel l_sinopse = new JLabel("Sinopse");
	private JTextArea i_sinopse = new JTextArea(0,0);
	private JPanel p_sinopse = new JPanel();

	private JLabel l_genero = new JLabel("Genero");
	private JComboBox<String> i_genero = new JComboBox<String>();
	private JPanel p_genero = new JPanel();

	private JButton b_salvar = new JButton("Salvar");
	private JButton b_cancelar = new JButton("Cancelar");
	private JPanel p_botoes = new JPanel();

	private JLabel l_onde = new JLabel("Onde assistir");
	private List<String> opcoes = Arrays.asList("Netflix", "Prime Video", "Pirate Bay");
	private JPanel p_opcoes = new JPanel();


	private JCheckBox c_opcoes = new JCheckBox("Assistido");

	//private JLabel l_avaliacao = new JLabel("Avaliação");
	private JPanel p_avaliacao = new JPanel();

	private JTabbedPane abas = new JTabbedPane();

	
	public void Movie(String titulo){
		setTitle(titulo);
	}

	public static void main(String[] args0) {
		new Movie().init("Fiap Movie");
	}

	private void init(String titulo){
		setTitle(titulo);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		this.monta_titulo();
		this.monta_sinopse();
		this.monta_genero();
		this.monta_botoes();
		this.monta_opcoes();
		JPanel jpanel = new JPanel();
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
		jpanel.setLayout(new GridLayout(1,3,10,0));
		jpanel.setSize(600, 400);
		jpanel.add(jpanel1);
		jpanel.add(jpanel2);
		jpanel.add(jpanel3); 

		jpanel1.add(this.i_filme);
		jpanel2.add(this.p_titulo);
		jpanel2.add(this.p_sinopse);
		jpanel2.add(this.p_genero);
		jpanel2.add(this.p_botoes);
		jpanel3.setLayout(new GridLayout(4,1));
		jpanel3.add(this.p_opcoes);
		jpanel3.add(this.p_avaliacao);
		jpanel3.setLayout(new GridLayout(2,1));
		abas.add("Cadastro", jpanel);
		abas.add("Lista", new JLabel(""));
		getContentPane().add(abas);
		abas.setVisible(true);
		abas.setBounds(0, 0, 600, 400);
	}

	public void monta_titulo(){
		this.i_titulo.setPreferredSize(new Dimension(190,30));
		this.i_titulo.setBackground(Color.WHITE);
		this.i_titulo.setForeground(new Color(50,50,50));
		this.i_titulo.setBorder(new LineBorder(new Color (26,108,163)));
		this.p_titulo.add(l_titulo);
		this.p_titulo.add(i_titulo);
		this.p_titulo.setLayout(new GridLayout(2,1));
		this.p_titulo.setSize(300, 300);       
	}

	public void monta_sinopse(){
		this.i_sinopse.setColumns(17);
		this.i_sinopse.setRows(5);
		this.i_sinopse.setBorder(new LineBorder(new Color (26,108,163)));
		this.p_sinopse.add(l_sinopse);
		this.p_sinopse.add(i_sinopse);
		this.p_sinopse.setLayout(new BoxLayout(this.p_sinopse, BoxLayout.PAGE_AXIS));
		//this.p_sinopse.setSize(300, 200);   
	}

	public void monta_genero(){
		this.i_genero.setPreferredSize(new Dimension(190,30));
		this.p_genero.add(l_genero);
		this.p_genero.add(i_genero);
		this.p_genero.setLayout(new GridLayout(2,1));
		this.p_genero.setSize(300, 300);     
	}

	public void monta_botoes(){
		this.p_botoes.add(b_salvar);
		this.p_botoes.add(b_cancelar);
	}

	public void monta_opcoes(){
		this.p_opcoes.add(this.l_onde);
		MyRadioGroup radiogroup = new MyRadioGroup(this.opcoes); 
		this.p_opcoes.add(radiogroup);
		this.p_opcoes.add(this.c_opcoes);
		this.p_opcoes.setLayout(new GridLayout(3,1));
		this.p_opcoes.setSize(300, 300);     
	}
}
