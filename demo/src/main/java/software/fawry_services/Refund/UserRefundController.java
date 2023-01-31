package software.fawry_services.Refund;

import org.springframework.stereotype.Component;
import software.fawry_services.Admin.AdminController;
import software.fawry_services.User.Transaction;
import software.fawry_services.User.User;
import software.fawry_services.User.UserController;
@Component
public class UserRefundController {
    AdminController adminController;
    UserController userController;


    public UserRefundController(AdminController adminController, UserController userController) {
        this.adminController = adminController;
        this.userController = userController;

    }
    public boolean addRefundRequest(User user,int index)
    {
        User tmp=userController.searchUser(user.getUsername());
        Transaction payment=tmp.getTransactions().get(index);
        RefundRequest refundRequest=new RefundRequest(payment,user);
        return adminController.addRefund(refundRequest);
    }
}
