import java.util.ArrayList;
abstract class Client {
    public int clientID;
    public String clientFname;
    public String clientLname;
    public ArrayList<Account> accounts = new ArrayList<>();

    public Client(int clientID, String clientFname, String clientLname) {
        this.clientID = clientID;
        this.clientFname = clientFname;
        this.clientLname = clientLname;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientFname() {
        return clientFname;
    }

    public void setClientFname(String clientFname) {
        this.clientFname = clientFname;
    }

    public String getClientLname() {
        return clientLname;
    }

    public void setClientLname(String clientLname) {
        this.clientLname = clientLname;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Client [clientID=" + clientID + ", clientFname=" + clientFname + ", clientLname=" + clientLname
                + ", accounts=" + accounts + "]";
    }
}
