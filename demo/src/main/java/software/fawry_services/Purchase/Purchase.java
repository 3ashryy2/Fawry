package software.fawry_services.Purchase;

import org.springframework.stereotype.Component;
import software.fawry_services.Purchase.Payment.AbstractPayment;
import software.fawry_services.Purchase.Payment.Billing.Billing;
import software.fawry_services.User.User;
import software.fawry_services.User.UserController;
@Component
public class Purchase {
    UserController userController;
    Billing bill;

    public Purchase(UserController userController) {
        this.userController = userController;
        this.bill=null;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public Billing getBill() {
        return bill;
    }

    public void setBill(Billing bill) {
        this.bill = bill;
    }
    public boolean PurchaseService(String serviceProvider, double amount, String serviceType, String paymentway, User user)
    {
        this.bill=new Billing();
        AbstractPayment tmmp =bill.createBill(serviceProvider,amount,serviceType,paymentway);
        User tmp=userController.searchUser(user.getUsername());
        tmp=tmmp.doPay(tmp);
        if (tmp!=null){
            tmp.addTransaction(tmmp.getFinalPrice(),tmmp.getAbstractService(),tmp);
            int index = userController.searchUserindex(user.getUsername());
            userController.getUsers().set(index, tmp);

            return true;
        }
        else return false;
    }
}
