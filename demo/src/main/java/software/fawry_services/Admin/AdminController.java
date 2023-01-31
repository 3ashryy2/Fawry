package software.fawry_services.Admin;

import org.springframework.stereotype.Component;
import software.fawry_services.Refund.RefundRequest;
import software.fawry_services.User.Transaction;

@Component
public class AdminController {
    private Admin admin;

    public AdminController(Admin admin) {
        this.admin = admin;
    }
    public boolean addRefund(RefundRequest refundRequest){

        boolean flag= admin.addRequest(refundRequest);
        return flag;

    }
    public Transaction acceptRefund(int index)
    {
        admin.getRefundRequests().get(index).setStatus("Accepted");
        return admin.getRefundRequests().get(index).getPayment();
    }
    public boolean rejectRefund(int index)
    {
        admin.getRefundRequests().get(index).setStatus("Rejected");
        return true;
    }
}
