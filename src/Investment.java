public class Investment extends Account implements InterestBearing {
    public double interest;
    public Investment(int accountID, double balance) {
        super(accountID, balance);
        interest = 1.05;
    }
    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
        public void deposit(double amnt) {
        setBalance(balance + amnt);
    }

    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", balance=" + balance + "]";
    }
    public void withdraw(double amnt) {
        System.out.print("Cannot withdraw from an investment account");
    }
}
