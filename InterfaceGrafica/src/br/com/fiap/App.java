package br.com.fiap;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class App {
	
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
		MeuLabel label1 = new MeuLabel("Meu label");
		Input input = new Input();
		MeuTextArea textArea = new MeuTextArea();
		JCheckBox checkBox = new JCheckBox();
		JTabbedPane tabbedPane = new JTabbedPane();
		

		jFrame.add(input);
		jFrame.add(label1);
//		jFrame.add(textArea,BorderLayout.AFTER_LAST_LINE);
//		jFrame.add(checkBox);
		label1.setHorizontalAlignment(JLabel.CENTER);
		jFrame.setSize(400, 200);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabbedPane.add("Cadastro", new JLabel("Primeira parte"));
		
	}

}
