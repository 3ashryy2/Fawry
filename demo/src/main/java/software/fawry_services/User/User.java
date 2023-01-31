package software.fawry_services.User;

import software.fawry_services.AbstractUser.AbstractUser;
import software.fawry_services.Purchase.Services.AbstractService;

import java.util.ArrayList;

public class User extends AbstractUser {

    ArrayList<Transaction> transactions;
    Wallet wallet;

    public User(String email, String username, String password) {
        super(email, username, password);
        this.transactions=new ArrayList<>();
        this.wallet=new Wallet();

    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public void addTransaction(double price, AbstractService service,User user){
        transactions.add(new Transaction(price,service,user));
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
