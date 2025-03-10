public class Main {
    private String modelName;
    private double modelBalance;

    // constructor method
    Main(final String name, double balance) {
        this.modelName = name;
        this.modelBalance = balance;
    }

    // check balance value
    void balance() {
        System.out.println("Hello, " + modelName + "!" + " You have a balance of: " + modelBalance);
    }

    // transfer value from other account
    void transfer(Main accountTransfer, double balance) {
        if(modelBalance >= balance) {
            debit(balance);
            deposit(accountTransfer, balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    // debits the account value
    void debit(double balance) {
        modelBalance -= balance;
    }

    // deposits the account value
    void deposit(Main account, double balance){
        account.modelBalance += balance;
    }

    public static void main(String[] args) {
    }
}

