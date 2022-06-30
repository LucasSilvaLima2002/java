package checkpoint;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Window.Type;

public class FiapMovies extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiapMovies frame = new FiapMovies();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
       
	public FiapMovies() {
		setTitle("FiapMovies");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel x = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/wanda.png")).getImage();
		x.setIcon(new ImageIcon(img));
		x.setBounds(10,49,166,256);
		
		
	}
	

}