public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds. Cannot transfer money.");
    }

}
