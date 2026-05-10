public class Transaction {
    public int transactionID;

    public Transaction(int transactionID) {
        this.transactionID = transactionID;
    }

    public void transfer(double amnt, Account sourceAcc, Account destinationAcc) throws InsufficientFundsException {
        if (amnt > sourceAcc.getBalance()) {
            throw new InsufficientFundsException();
        }
        sourceAcc.setBalance(sourceAcc.getBalance() - amnt);
        destinationAcc.setBalance(destinationAcc.getBalance() - amnt);
    }
}
