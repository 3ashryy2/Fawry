package software.fawry_services.Purchase.Services;

public class WalletRecharge extends AbstractService{
    public WalletRecharge(double p, String s) {
        super(p, s);
    }

    @Override
    public double calcFees() {
        return getPrice();
    }
}
