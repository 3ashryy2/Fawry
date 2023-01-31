package software.fawry_services.Purchase.Services;

public class MobileRecharge extends AbstractService{


    public MobileRecharge(double p, String s) {
        super(p, s);

    }

    @Override
    public double calcFees() {
        String tmp=provider;

        switch (tmp){
            case "Vodafone":
                return getPrice()+1.5;

            case "Etisalat":
                return getPrice()+2.5;
            case "WE":
                return getPrice()+3.5;

            case "Orange":
                return getPrice()+4.5;
            default: return -1;
        }
    }
}
