package software.fawry_services.Purchase.Services;

public class Donations extends AbstractService{
    public Donations(double p, String s) {
        super(p, s);
    }


    @Override
    public double calcFees() {
        String tmp=provider;

        switch (tmp){
            case "Cancer Hospital":
                return getPrice();

            case "Etisalat":
                return getPrice();

            case "NGO":
                return getPrice();
            default: return -1;
        }
    }
}
