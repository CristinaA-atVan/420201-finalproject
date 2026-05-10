public class MissingChequingAccountException extends Exception {

    public MissingChequingAccountException() {
        super("You need a chequing account before you can open a Savings or Investment account.");
    }

}
