package software.fawry_services.Refund;

import software.fawry_services.User.Transaction;
import software.fawry_services.User.User;

public class RefundRequest {

    Transaction payment;
    User user;
    String status;
    public RefundRequest(Transaction payment, User user) {
        this.payment = payment;
        this.user = user;
        this.status ="pending";
    }

    public Transaction getPayment() {
        return payment;
    }

    public void setPayment(Transaction payment) {
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
