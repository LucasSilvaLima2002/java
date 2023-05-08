import javax.swing.JOptionPane;
import java.lang.*;;

public class GUI {

    public static void main(String[] args) {
        

       

        String name = JOptionPane.showInputDialog(null, "Insira o usuario");

        String message = String.format("Welcome, %s to Java Programming!" , name);
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}
