package tentativa;

import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Botao extends JFrame{
	public static void main(String[] args) {
	
		new Botao();
	}
	public Botao() {
		setTitle("Fiap Movies");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel jlabel = new JLabel("Texto");
		jlabel.setBounds(223, 11, 46, 14);
		jlabel.setFont(new Font("Arial",Font.BOLD,16));
		getContentPane().add(jlabel);
		
		
	}

}
