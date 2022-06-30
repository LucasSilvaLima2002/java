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



public class Teste1 extends JFrame {

public static void main(String[] args) {
	
	new Teste1();
	
	
	
}

	public Teste1() {
		

		setTitle("Fiap Movies");
		setBounds(100, 100, 542, 312);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		
		
		
		JLabel jlabel = new JLabel("Titulo");
		jlabel.setBounds(223, 34, 46, 14);
		jlabel.setFont(new Font("Arial",Font.BOLD,12));
		getContentPane().add(jlabel);
		
		Jtextfield text = new Jtextfield();
		text.setBounds(223,59,122,20);
		getContentPane().add(text);
		
		
		JLabel jlabel1 = new JLabel("Sinopse");
		jlabel1.setBounds(223, 102, 46, 14);
		jlabel1.setFont(new Font("Arial",Font.BOLD,12));
		getContentPane().add(jlabel1);
		
		JLabel jlabel2 = new JLabel("Genero");
		jlabel2.setBounds(223, 157, 46, 14);
		jlabel2.setFont(new Font("Arial",Font.BOLD,12));
		getContentPane().add(jlabel2);
		
		JLabel jlabel3 = new JLabel("Onde assistir");
		jlabel3.setBounds(364, 22, 80, 30);
		jlabel3.setFont(new Font("Arial",Font.BOLD,12));
		getContentPane().add(jlabel3);
		
		JRadioButton button1 = new JRadioButton("Netflix");
		button1.setBounds(364, 50, 80, 20);
		getContentPane().add(button1);
		
		JRadioButton button2 = new JRadioButton("Prime Video");
		button2.setBounds(364, 80, 150, 20);
		getContentPane().add(button2);
		
		JRadioButton button3 = new JRadioButton("Pirate Bay");
		button3.setBounds(350, 106, 90, 10);
		getContentPane().add(button3);
		
				
//		JComboBox<String> box = new JComboBox<String>();
//		
//		//*********AVISO************//
//		//Não sei porque a ComboBox fica invisivel até o botão ser apertado//
//		box.addItem("Ação");
//		box.addItem("Terror");
//		box.addItem("Suspense");
//		box.addItem("Romance");
//		box.addItem("Drama");
//		getContentPane().setLayout(new FlowLayout());
//		box.setBounds(223,185,122,20);
//		getContentPane().add(box);
	
		
	
		
	
	}
	
		
	}


	
	
	

