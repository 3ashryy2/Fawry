package software.fawry_services.Purchase.Payment;

import software.fawry_services.Purchase.Services.AbstractService;
import software.fawry_services.User.User;

public abstract class AbstractPayment {

    AbstractService abstractService;
    double finalPrice=0.0;

    public AbstractService getAbstractService() {
        return abstractService;
    }

    public void setAbstractService(AbstractService abstractService) {
        this.abstractService = abstractService;
    }

    public AbstractPayment(AbstractService absService) {
        this.abstractService=absService;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public abstract User doPay(User user) ;


}
