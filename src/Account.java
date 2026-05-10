abstract class Account {
    public int accountID;
    public double balance;

    public Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
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
}
