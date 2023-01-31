package software.fawry_services.Purchase.Services;

public class LandLine extends AbstractService{

    public LandLine(double p, String s) {
        super(p, s);
    }

    @Override
    public double calcFees() {
        String tmp=provider;
        switch (tmp){
            case "Monthly receipt":
                return getPrice()+10;

            case "Quarter receipt":
                return getPrice()+30;

            default: return -1;
        }
    }
}
