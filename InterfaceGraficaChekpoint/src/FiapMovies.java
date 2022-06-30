import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;






public class FiapMovies extends JFrame {
	
	public static void main(String[] args) {
		
		 
		JFrame jFrame = new JFrame();
		JLabel label =  new JLabel();
		ContentPane cont = new ContentPane();
		Jpanel jpanel = new Jpanel();
		JTabbedPane jtabbedpane = new JTabbedPane(JTabbedPane.TOP);
		

		
		jFrame.setTitle("Fiap Movies");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		jFrame.setBounds(100, 100, 542, 312);
		//jFrame.add(cont);
		jFrame.add(jpanel);
		jFrame.add(jtabbedpane);
//	    JLabel lblImagem = new JLabel("");
//		lblImagem.setIcon(new ImageIcon(FiapMovies.class.getResource("/Imagens/clockwork orange.png")));
//		lblImagem.setBounds(10, 11, 155, 205);
//		jpanel.add(lblImagem);
//	
		
		
		
		
		
	}
	
	

	
}

