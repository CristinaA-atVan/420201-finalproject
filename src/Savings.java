public class Savings extends Account implements InterestBearing {
    public double interest;
    public Savings(int accountID, double balance) {
        super(accountID, balance);
        interest = 1.02;
    }
    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", balance=" + balance + "]";
    }
}
