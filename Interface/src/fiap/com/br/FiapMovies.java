package fiap.com.br;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FiapMovies extends JFrame{

public static void main(String[] args) {
	
	JFrame jframe = new JFrame();
	Botão botão = new Botão();
	Layout laayout = new Layout();
	
	jframe.add(laayout);
	jframe.add(botão);

	

}
}

