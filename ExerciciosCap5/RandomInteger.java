import java.security.SecureRandom;
import java.util.function.BinaryOperator;

import javax.print.DocFlavor.STRING;

public class RandomInteger {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        

        for (int counter = 1; counter <= 20; counter++)
     {
        int number = 2 + 3 * randomNumbers.nextInt(5);
        System.out.println(number);

        if (counter % 5 == 0)
     System.out.println();


     }

       

       

    }
}
