package FiapMovies;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FiapMovies_Interface extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtSinopse;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiapMovies_Interface frame = new FiapMovies_Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FiapMovies_Interface() {
		setForeground(Color.WHITE);
		setTitle("Fiap Movies");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 312);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 526, 273);
		contentPane.add(tabbedPane);
		
		JPanel pnlCadastro = new JPanel();
		tabbedPane.addTab("Cadastro", null, pnlCadastro, null);
		pnlCadastro.setLayout(null);
		StarRater starRater = new StarRater();
//		starRater.setToolTipText("");
//		starRater.setBounds(362, 140, 104, 25);
		pnlCadastro.add(starRater);
//		starRater.setLayout(null);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon(FiapMovies_Interface.class.getResource("/Imagens/WandaVision.jpg")));
		lblImagem.setBounds(10, 11, 155, 205);
		pnlCadastro.add(lblImagem);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(175, 11, 57, 16);
		pnlCadastro.add(lblNewLabel_1);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(175, 30, 165, 25);
		pnlCadastro.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sinopse");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(175, 58, 57, 16);
		pnlCadastro.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("G\u00EAnero");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(175, 110, 57, 16);
		pnlCadastro.add(lblNewLabel_1_2);
		
		txtSinopse = new JTextField();
		txtSinopse.setColumns(10);
		txtSinopse.setBounds(175, 80, 165, 25);
		pnlCadastro.add(txtSinopse);
		
//		JComboBox cboGenero = new JComboBox();
//		cboGenero.setModel(new DefaultComboBoxModel(new String[] {"", "Romance", "A\u00E7\u00E3o", "Terror", "Horror", "Aventura", "Drama", "Suspense"}));
//		cboGenero.setBounds(175, 130, 165, 25);
//		pnlCadastro.add(cboGenero);
		
//		JButton btnSalvar = new JButton("Salvar");
//		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
//		btnSalvar.setBounds(175, 185, 89, 31);
//		pnlCadastro.add(btnSalvar);
//		
//		JButton btnCancelar = new JButton("Cancelar");
//		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
//		btnCancelar.setBounds(265, 185, 89, 31);
//		pnlCadastro.add(btnCancelar);
//		
//		JLabel lblNewLabel_1_3 = new JLabel("Onde Assistir");
//		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
//		lblNewLabel_1_3.setBounds(362, 11, 104, 16);
//		pnlCadastro.add(lblNewLabel_1_3);
//		
//		JRadioButton rdbtnNetflix = new JRadioButton("Netflix");
//		rdbtnNetflix.setBounds(362, 31, 109, 23);
//		pnlCadastro.add(rdbtnNetflix);
//		
//		JRadioButton rdbtnPrimeVideo = new JRadioButton("Prime Video");
//		rdbtnPrimeVideo.setBounds(362, 50, 109, 23);
//		pnlCadastro.add(rdbtnPrimeVideo);
//		
//		JRadioButton rdbtnPirateBay = new JRadioButton("Pirate Bay");
//		rdbtnPirateBay.setBounds(362, 70, 109, 23);
//		pnlCadastro.add(rdbtnPirateBay);
//		
//		JCheckBox chckbxAssistindo = new JCheckBox("Assistido");
//		chckbxAssistindo.setBounds(362, 93, 99, 23);
//		pnlCadastro.add(chckbxAssistindo);
//		
		JLabel lblNewLabel_1_4 = new JLabel("Avalia\u00E7\u00E3o");
//		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
//		lblNewLabel_1_4.setBounds(362, 121, 104, 16);
//		pnlCadastro.add(lblNewLabel_1_4);
//		
//		JPanel pnlLista = new JPanel();
//		tabbedPane.addTab("Lista", null, pnlLista, null);
	}
}
