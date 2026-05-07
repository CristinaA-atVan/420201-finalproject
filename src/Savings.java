public class Savings extends Account implements InterestBearing {
    public double interest;
    public Savings(int accountID, double balance) {
        super(accountID, balance);
        interest = 1.02;
    }
}
