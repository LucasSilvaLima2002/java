import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

public class ContentPane extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContentPane() {
		super();
		init();
	}
	
	
	 private void init() {
		 this.setBackground(Color.WHITE);
		 this.setBorder(new EmptyBorder(5,5,5,5));
		 this.setLayout(null);
		 
	 }
	
	
}
