import javax.swing.JPanel;
import java.awt.Graphics;


public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g){ //desenha um x
        //chama o componente pra segurar que foi inserido corretamente
        super.paintComponent(g);

int width = getWidth(); // largura total 
int height = getHeight(); // altura total
 // desenha uma linha a partir do canto superior esquerdo até o inferior direito
g.drawLine(0, 0, width, height);

 // desenha uma linha a partir do canto inferior esquerdo até o superior direito
g.drawLine(0, height, width, 0);
    
    }
}
