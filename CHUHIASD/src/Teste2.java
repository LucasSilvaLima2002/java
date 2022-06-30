import java.awt.Font;
import java.util.Arrays;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Teste2 extends JFrame {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {
		new Teste2();
		
	}

	public Teste2() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		setTitle("                                                                            Fiap Movies");
		setBounds(400, 400, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);

		JLabel jlabel = new JLabel("Titulo");
		jlabel.setBounds(226, 90, 46, 14);
		jlabel.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(jlabel);

		Jtextfield textTitulo = new Jtextfield();
		textTitulo.setBounds(226, 115, 154, 20);
		getContentPane().add(textTitulo);
		
		JTextArea textSinopse = new JTextArea();
		textSinopse.setBounds(226, 159, 154, 45);
		getContentPane().add(textSinopse);

		JLabel jlabel1 = new JLabel("Sinopse");
		jlabel1.setBounds(226, 146, 46, 14);
		jlabel1.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(jlabel1);

		JLabel jlabel2 = new JLabel("Genero");
		jlabel2.setBounds(226, 215, 46, 14);
		jlabel2.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(jlabel2);

		JLabel jlabel3 = new JLabel("Onde assistir");
		jlabel3.setBounds(393, 82, 80, 30);
		jlabel3.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(jlabel3);

		
		JRadioButton button1 = new JRadioButton("Netflix");
		button1.setBounds(393, 115, 80, 20);
		getContentPane().add(button1);

		JRadioButton button2 = new JRadioButton("Prime Video");
		button2.setBounds(393, 138, 97, 14);
		getContentPane().add(button2);

		JRadioButton button3 = new JRadioButton("Pirate Bay");
		button3.setBounds(393, 157, 90, 24);
		getContentPane().add(button3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);

		JCheckBox check = new JCheckBox("Assistido");
		check.setBounds(393, 184, 97, 23);
		getContentPane().add(check);

		JComboBox<String> box = new JComboBox<String>();
		box.setBounds(226, 240, 154, 20);
		box.addItem("Ação");
		box.addItem("Terror");
		box.addItem("Suspense");
		box.addItem("Romance");
		box.addItem("Drama");
		getContentPane().add(box);

		JLabel img = new JLabel(new ImageIcon("C:\\Users\\teste\\Pictures\\clock.png"));
		img.setBounds(58, 78, 158, 260);
		getContentPane().add(img);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(305, 271, 75, 20);
		botaoCancelar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		getContentPane().add(botaoCancelar);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(226, 271, 75, 20);
		botaoSalvar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		getContentPane().add(botaoSalvar);
		
		JLabel jlabel4 = new JLabel("Avaliação");
		jlabel4.setBounds(393, 230, 80, 30);
		jlabel4.setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().add(jlabel4);
		
		//Peguei a classe StarRater do gift hub//
		//https://github.com/marcoc1712/musicbrainzws2-java-google/blob/master/mc2java/src/org/mc2/util/starRater/StarRater.java//
		StarRater star = new StarRater();
		star.setBounds(393, 250, 80, 30);
		getContentPane().add(star);
		
		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		aba.setBounds(10, 46, 564, 310);
		getContentPane().add(aba);
		
		JPanel panel1 = new JPanel();
		aba.addTab("Cadastro", null, panel1, null);
		
		JPanel panel2 = new JPanel();
		aba.addTab("Lista", null, panel2, null);

		 JLabel l_onde = new JLabel("Onde assistir");
	 List<String> opcoes = Arrays.asList("Netflix", "Prime Video", "Pirate Bay");
		 JPanel p_opcoes = new JPanel();
		 
		 getContentPane().add(p_opcoes);
		
		
		
		

	

	}
}
