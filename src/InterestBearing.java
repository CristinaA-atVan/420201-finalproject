public interface InterestBearing {
    public default double applyInterest(double interest, double addInterest, double balance) {
        interest = interest + addInterest;
        balance = balance + interest;
        return balance;
    }
}
