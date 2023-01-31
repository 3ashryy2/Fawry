package software.fawry_services.Refund;

import org.springframework.stereotype.Component;
import software.fawry_services.Admin.AdminController;
import software.fawry_services.User.Transaction;
import software.fawry_services.User.User;
import software.fawry_services.User.UserController;
@Component
public class AdminRefundController {

    AdminController adminController;
    UserController userController;


    public AdminRefundController(AdminController adminController, UserController userController) {
        this.adminController = adminController;
        this.userController = userController;

    }
    public boolean DecideRefund(boolean decide,int index)
    {
        if (decide)
        {
            Transaction tmp=adminController.acceptRefund(index);
            User u=userController.searchUser(tmp.getUser().getUsername());
            int inx=userController.searchUserindex(tmp.getUser().getUsername());
            u.getWallet().incBalance(tmp.getPrice());
            userController.getUsers().add(inx,u);
            return true;
        }
        else return adminController.rejectRefund(index);
    }
}
