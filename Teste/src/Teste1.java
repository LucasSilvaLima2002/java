import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;



public class Teste1 extends JFrame {

public static void main(String[] args) {
	
	new Teste1();
	
	
	
}

	public Teste1() {
		

		setTitle("Fiap Movies");
		setSize(1000,1000);
		setBounds(100, 100, 542, 312);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(102, 21, 199, 156);
		getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		panel.add(rdbtnNewRadioButton);
		
		
		
		
		
	
		
	
	}
	}


	
	
	

