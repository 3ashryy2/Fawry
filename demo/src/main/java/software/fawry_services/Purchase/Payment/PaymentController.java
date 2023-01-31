package software.fawry_services.Purchase.Payment;

import software.fawry_services.Purchase.Payment.Discount.AbstractDiscount;
import software.fawry_services.Purchase.Payment.Discount.Overall;
import software.fawry_services.Purchase.Payment.Discount.Specific;
import software.fawry_services.Purchase.Services.AbstractService;

public class PaymentController {
    AbstractPayment payment;
    AbstractDiscount discount;



    public PaymentController(AbstractPayment payment) {
        this.payment = payment;
        this.discount=null;
    }

    public AbstractPayment getPayment() {
        return payment;
    }

    public void setPayment(AbstractPayment payment) {
        this.payment = payment;
    }

    public AbstractDiscount getDiscount() {
        return discount;
    }

    public void setDiscount(AbstractDiscount discount) {
        this.discount = discount;
    }
    public boolean addDiscount(double dis,String type,AbstractService abstractService,AbstractPayment abstractPayment)
    {
        AbstractDiscount tmp;
        AbstractPayment tmmp;
        if (!checkDiscount()) {
            tmmp = abstractPayment;
        }
        else {
            tmmp=getDiscount();
        }

        if (type=="General")
        {
                tmp = new Overall(dis, type, abstractService,tmmp);
        } else {

                tmp = new Specific(dis, type, abstractService, tmmp);
        }

        setDiscount(tmp);
        return true;
    }
    public boolean checkDiscount()
    {
        return getDiscount()!=null;
    }

}
