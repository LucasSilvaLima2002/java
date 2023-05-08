import java.util.Scanner;

public class Asteristico{

public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.printf("********\t\t    ***    \t\t   *   \t         *          \n");
    System.out.printf("*      *\t\t  *     *  \t\t  ***  \t       *   *        \n");
    System.out.printf("*      *\t\t*         *\t\t ***** \t     *       *      \n");
    System.out.printf("*      *\t\t*         *\t\t   *   \t   *           *    \n");
    System.out.printf("*      *\t\t*         *\t\t   *   \t *               *  \n");
    System.out.printf("*      *\t\t*         *\t\t   *   \t   *           *    \n");
    System.out.printf("*      *\t\t*         *\t\t   *   \t     *       *      \n");
    System.out.printf("*      *\t\t  *     *  \t\t   *   \t       *   *        \n");
    System.out.printf("********\t\t    ***    \t\t   *   \t         *          \n");


    

    System.out.print("* * * * * * * *\n");
    System.out.print(" * * * * * * * *\n");
    System.out.print("* * * * * * * *\n");
    System.out.print(" * * * * * * * *\n");
    System.out.print("* * * * * * * *\n");
    System.out.print(" * * * * * * * *\n");


    System.out.println("Qual o valor do raio?");
    int raio = input.nextInt();

    double pi = 3.14159;

    System.out.printf("Diametro é igual a %d%n", 2*raio);
    System.out.printf("O valor da circunferencia é igual a %2f%" , (pi * raio));
    

    
    





}


}