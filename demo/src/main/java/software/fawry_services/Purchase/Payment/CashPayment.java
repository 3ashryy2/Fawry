package software.fawry_services.Purchase.Payment;

import software.fawry_services.Purchase.Services.AbstractService;
import software.fawry_services.User.User;

public class CashPayment extends AbstractPayment{

    public CashPayment(AbstractService abstractService) {
        super(abstractService);
    }

    @Override
    public User doPay(User user) {
        setFinalPrice(abstractService.getPrice());
        return user;

    }
}
