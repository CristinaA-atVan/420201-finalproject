public class InvestmentLockException extends Exception {

    public InvestmentLockException() {
        super("Cannot transfer funds from an investment amount. The 1 year investment lock period is not over yet.");
    }

}
