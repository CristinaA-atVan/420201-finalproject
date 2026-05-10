public class Chequing extends Account implements Maintainable {
    public double interest;
    public Chequing(int accountID, double balance) {
        super(accountID, balance);
    }
    
    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", balance=" + balance + "]";
    }
}
