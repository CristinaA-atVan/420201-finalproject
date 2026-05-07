public class Investment extends Account implements InterestBearing {
    public double interest;
    public Investment(int accountID, double balance) {
        super(accountID, balance);
        interest = 1.05;
    }
    public void withdraw(double amnt) {
        System.out.print("Cannot withdraw from an investment account");
    }
}
