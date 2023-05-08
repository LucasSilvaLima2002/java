import java.util.Scanner;

public class AccountMain {
   
    public static void main(String[] args) {

        

        Account account1 = new Account("Jane Green",50.0); 
        Account account2 = new Account("John Blue", -7.53); 
     

        System.out.printf("%s balance: %.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter deposit name account 1");
        double depositAmount =  scan.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.printf("%s balance: %.2f %n",account1.getName(),account1.getBalance());
        
        System.out.println("Enter deposit name account 2");
        depositAmount =  scan.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        System.out.printf("%s balance: %.2f %n",account2.getName(),account2.getBalance());
       

      

    }
    
}
