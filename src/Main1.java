public class Main1 {
    static void main() {
    Account account = new Account();
    account.setAccountDetails(101,"Salman",100);
    account.withdraw(20);
    account.deposit(20);
    account.displayAccountDetails();
    }
}

class Account {
    int accountNo;
    String custName;
    double accountBalance;
    void setAccountDetails(int accountNo, String custName, double accountBalance) {
        this.accountNo = accountNo;
        this.custName = custName;
        this.accountBalance = accountBalance;
    }
    void withdraw(double amount) {
        if(amount  < accountBalance){
            accountBalance -= amount;
        }
        else{
            throw new IllegalArgumentException("Sufficient Balance Not Exist");
        }
    }
    void deposit(double amount) {
        accountBalance += amount;
    }
    void displayAccountDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Name: " + custName);
        System.out.println("Account Balance: " + accountBalance);
    }
}