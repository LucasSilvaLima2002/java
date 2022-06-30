package fiap.com.br;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botão extends JFrame implements ActionListener{

	JButton jb = new JButton("Salvar");
	JButton jb2 = new JButton("Cancelar");
	


public void actionPerformed(ActionEvent e) {
	
	JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
}
public Botão() {
	botão();
}
	
	private void botão() {
	    jb.addActionListener(this);
		setLayout(null);
		jb.setBounds(240,480,90,30);
		jb2.setBounds(350,480,90,30);
	    add(jb);
	    add(jb2);
		setTitle("Fiap Movies");
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}
	public static void main(String[] args) {
		new Botão();
		
		
		
	}
}
