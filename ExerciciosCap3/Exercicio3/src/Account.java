public class Account {

    private String name;
    private double balance;


    public Account(String name, double balance) {

        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }



    public void deposit(double depositAmout){
        if(depositAmout > 0){
            balance = balance + depositAmout;
        }

        public void withdraw(){
            
        }
        
    }


}
