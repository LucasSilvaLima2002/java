import java.util.InputMismatchException;
import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        int x;

        Scanner scan = new Scanner(System.in);


        
        try {System.out.println("Digite o valor de x");
             x = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            x = 30;
        }

        System.out.println(30);
       
       
    }
    
}
