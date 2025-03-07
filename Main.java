public class Main {
    String modelName;
    double modelBalance;

    // constructor method
    Main(String name, double balance) {
        modelName = name;
        modelBalance = balance;
    }

    // check balance value
    void balance(Main account) {
        System.out.println("Hello, " + account.modelName + "!" + " You have a balance of: " + account.modelBalance);
    }

    // transfer value from other account
    void transfer(Main account, Main accountTransfer, double balance) {
        if(account.modelBalance >= balance) {
            debit(account, balance);
            deposit(accountTransfer, balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

    // debits the account value
    void debit(Main account, double balance) {
        account.modelBalance -= balance;
    }

    // deposits the account value
    void deposit(Main account, double balance){
        account.modelBalance += balance;
    }

    public static void main(String[] args) {

    }
}