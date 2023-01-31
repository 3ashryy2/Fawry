package software.fawry_services.Purchase.Payment;

import software.fawry_services.Purchase.Services.AbstractService;
import software.fawry_services.User.User;

public class WalletPayment extends AbstractPayment{

    public WalletPayment(AbstractService abstractService) {
        super(abstractService);
    }

    @Override
    public User doPay(User user) {
        double price= getAbstractService().getPrice();
        if (user.getWallet().getBalance()>=price)
        {
            user.getWallet().decBalance(price);
            setFinalPrice(abstractService.getPrice());
            return user;
        }
        return null;
    }
}
