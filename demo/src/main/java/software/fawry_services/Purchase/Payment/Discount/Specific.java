package software.fawry_services.Purchase.Payment.Discount;

import software.fawry_services.Purchase.Payment.AbstractPayment;
import software.fawry_services.Purchase.Services.AbstractService;

public class Specific extends AbstractDiscount{
    public Specific(double d, String t, AbstractService abstractService,AbstractPayment payment) {
        super(d, t, abstractService,payment);
    }

    @Override
    public double addDiscount(double price) {
        if (getAbstractService()==getType())
           return (price/100)*(100-getDiscount());
        return price;
    }
}
