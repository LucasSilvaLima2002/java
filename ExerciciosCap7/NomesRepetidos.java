import java.util.Scanner;

public class NomesRepetidos {
    public static void main(String[] args) {
        
        String[] nome = new String[4];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Qual o nome");
            nome [i] = scanner.nextLine();

            for (int j = 0; j < i; j++) {
                if(nome[i].equals(nome[j])){
                    i--;
                    System.out.println("Digite outro nome");
                }
        }

    }
    for (int i = 0; i < nome.length; i++) {
        System.out.println(nome[i]);
    }
}
}
