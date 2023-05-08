import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.random.RandomGenerator;

public class LetrasEmbaralhadas {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean iguais = true;
       

        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();

        String [] arrayList = palavra.split("");
        int [] x =new int[arrayList.length];

        for (int i = 0; i < arrayList.length; i++) {

            
           x[i] = random.nextInt(arrayList.length);

           for (int j = 0; j < i; j++) {
            if (x[i] == x[j]) {
                i--;
                break;
            }
           }

           } for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[x[i]]);
        }
    }
}

