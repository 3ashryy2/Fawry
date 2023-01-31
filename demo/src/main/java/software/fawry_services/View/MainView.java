package software.fawry_services.View;

import software.fawry_services.AbstractUser.AbstractUser;
import software.fawry_services.Admin.Admin;
import software.fawry_services.Admin.AdminController;
import software.fawry_services.Purchase.Payment.PaymentController;
import software.fawry_services.Purchase.Purchase;
import software.fawry_services.Refund.AdminRefundController;
import software.fawry_services.Refund.UserRefundController;
import software.fawry_services.User.UserController;

public class MainView {



    private AbstractUser active;
    private AbstractUser admin = new Admin("admin","admin", "admin");
    private PaymentController paymentController;
    private UserRefundController UserrefundController;
    private AdminController adminController;
    private AdminRefundController adminRefundController;
    private UserController userController;
    private Purchase purchase;




    public AbstractUser getActive() {
        return active;
    }

    public void setActive(AbstractUser active) {
        this.active = active;
    }

    public AbstractUser getAdmin() {
        return admin;
    }

    public void setAdmin(AbstractUser admin) {
        this.admin = admin;
    }


    public MainView() {

        this.active = null;
    }

    public String Login(String username, String password) {
        if (password == admin.getPassword() && username == admin.getUsername()) {
            this.setActive(admin);

            return "Logged in as admin successfully";
        } else {


            if (userController.Login(username, password)!=null) {

                this.setActive(userController.Login(username, password));
                return "Logged in as " + username + " successfully";
            } else
                return "Failed to Login";
        }
    }

    public String signUp(String email,String username,String password) {


             boolean flag=userController.addUser(email,username,password);
             if (flag)
             {
                 return "User added successfully";
             }
             else
                 return "User is already exist";
    }



}
