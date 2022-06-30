package fiap.com.br.controler;

import java.awt.event.ActionEvent;
import FiapMovie.FiapMovie;
import fiap.com.br.ig.dao.*;
import java.awt.event.ActionListener;



public class BotaoListener implements ActionListener {

	private FiapMovie view;
	private FilmeDao dao = new FilmeDao();
	
	public BotaoListener(FiapMovie view) {
		this.view = view;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	

}
