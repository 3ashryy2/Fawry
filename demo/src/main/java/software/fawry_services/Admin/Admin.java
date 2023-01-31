package software.fawry_services.Admin;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import software.fawry_services.AbstractUser.AbstractUser;
import software.fawry_services.Refund.RefundRequest;

import java.util.ArrayList;


public class Admin extends AbstractUser {
    ArrayList<RefundRequest> refundRequests;

    public Admin(String email, String username, String password) {
        super(email, username, password);
        this.refundRequests=new ArrayList<RefundRequest>();
    }

    public boolean addRequest(RefundRequest refundRequest)
    {
        refundRequests.add(refundRequest);
        return true;
    }

    public ArrayList<RefundRequest> getRefundRequests() {
        return refundRequests;
    }

    public void setRefundRequests(ArrayList<RefundRequest> refundRequests) {
        this.refundRequests = refundRequests;
    }
}
