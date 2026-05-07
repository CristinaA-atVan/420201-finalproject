public interface Maintainable {
    public default double applyMonthlyFee(double fee, double balance) {
        balance = balance - fee;
        return balance;
    }

}
