import java.util.Scanner;


public class AccountTest2{
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n", myAccount.getName());

        System.out.println("Please enter the name");
        String name = input.nextLine();
        myAccount.setName(name);

        System.out.printf("Initial name is: %s", myAccount.getName());


    }
}
