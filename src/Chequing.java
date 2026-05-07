public class Chequing extends Account implements Maintainable {
    public double interest;
    public Chequing(int accountID, double balance) {
        super(accountID, balance);
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

    public void withdraw(double amnt) {
        setBalance(balance - amnt);
    }

        public void deposit(double amnt) {
        setBalance(balance + amnt);
    }

    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", balance=" + balance + "]";
    }
}
