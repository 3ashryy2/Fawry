package software.fawry_services.Purchase.Services;

public abstract class AbstractService {

    private double price;
    String provider;

    public AbstractService(double p,String s)
    {
        this.price=p;
        this.provider=s;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public abstract double calcFees();

}
