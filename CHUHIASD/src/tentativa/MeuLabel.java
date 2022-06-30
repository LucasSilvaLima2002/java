package tentativa;

import java.awt.Font;

import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MeuLabel extends JLabel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MeuLabel(){
		init();
	}
	
	public MeuLabel(String text) {
		this.setText(text);
		init();
		
	}
private void init() {
	this.setFont(new Font("Arial", Font.BOLD, 12));

}
}
