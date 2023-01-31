package software.fawry_services.User;

public class Wallet {

    double balance;

    public Wallet(double balance) {
        this.balance = balance;
    }

    public Wallet() {
        this.balance=0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void incBalance(double price) {
        this.balance -= price;
    }
    public void decBalance(double credit) {
        this.balance -= credit;
    }



}
