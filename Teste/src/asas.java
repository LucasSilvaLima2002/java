import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class asas extends JFrame {
public static void main(String[] args) {
	new asas();
}
	
public asas() {
	

	setTitle("Fiap Movies");
setSize(1000,1000);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	getContentPane().setLayout(null);
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setToolTipText("teste");
	tabbedPane.setBounds(40, 11, 285, 221);
	getContentPane().add(tabbedPane);
	
	JPanel panel = new JPanel();
	tabbedPane.addTab("New tab", null, panel, null);
	
	

	
	

	
	
}
}
