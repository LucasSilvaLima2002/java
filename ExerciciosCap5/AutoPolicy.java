public class AutoPolicy {

    private int accountNumber; // número da conta da apólice
    private String makeAndModel; // carro ao qual a apólice é aplicada
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;

                break;

        }
        return noFaultState;
    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState()== true) ? "is" : "is not"
                );

            
       
    }

    

    

   
}
