package fiap.com.br;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{
public Layout() {
	laayout();
}
	

private void laayout() {
	JButton jb = new JButton("Cadastro");
	JButton jb1 = new JButton("Lista");	
	setLayout(new FlowLayout(FlowLayout.LEFT));
	add(jb);
	add(jb1);
	setTitle("Fiap Movies");
	setSize(700, 600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setVisible(true);
}
	public static void main(String[] args) {
		new Layout();
	}	
}
