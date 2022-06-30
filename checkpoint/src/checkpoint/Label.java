package checkpoint;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Label extends JLabel{
	
	private static final long serialVersionUID = 1L;
	public Label(){
	
	}
	public Label(String text) {
		this.setText(text);
		init();
	}
	public void init() {
		this.setForeground(new Color(255,0,150));
		this.setBackground(Color.BLUE);
		this.setBorder(new LineBorder(new Color(0,0,255)));
	}
	
}
