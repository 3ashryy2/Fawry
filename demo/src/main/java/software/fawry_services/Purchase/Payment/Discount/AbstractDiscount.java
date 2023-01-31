package software.fawry_services.Purchase.Payment.Discount;

import software.fawry_services.Purchase.Payment.AbstractPayment;
import software.fawry_services.Purchase.Services.*;
import software.fawry_services.User.User;

public abstract class AbstractDiscount extends AbstractPayment {

    AbstractPayment payment;
    AbstractService type;
    double discount;
    public AbstractDiscount(double d,String t,AbstractService abstractService,AbstractPayment payment) {
        super(abstractService);
        this.payment=payment;
        this.discount=d;
        switch (t){
            case "Donations":
                this.type=new Donations(0.0,"");
                break;
            case "InternetRecharge":
                this.type=new InternetRecharge(0.0,"");
                break;
            case "LandLine":
                this.type=new LandLine(0.0,"");
                break;
            case "MobileRecharge":
                this.type=new MobileRecharge(0.0,"");
                break;
            case "WalletRecharge":
                this.type=new WalletRecharge(0.0,"");
                break;
            case "General":
                this.type=null;
                break;
            default:break;
        }
    }

    @Override
    public User doPay(User user) {
        double price= getAbstractService().getPrice();
        price=addDiscount(price);
        getAbstractService().setPrice(price);
        return payment.doPay(user);
    }


    public abstract double addDiscount(double price);

    public AbstractService getType() {
        return type;
    }

    public void setType(AbstractService type) {
        this.type = type;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public AbstractPayment getPayment() {
        return payment;
    }

    public void setPayment(AbstractPayment payment) {
        this.payment = payment;
    }
}
