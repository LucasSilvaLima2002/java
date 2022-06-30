import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Jtextfield extends JTextField {

	public void jtextfield() {
		init();
	}
	private void init() {
		this.setPreferredSize(new Dimension(200,30));
		this.setBackground(Color.WHITE);
		this.setForeground(new Color(50,50,50));
		this.setBorder(new LineBorder(new Color(26,108,163)));
		
	}
}
