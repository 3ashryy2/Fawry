package software.fawry_services.User;

import software.fawry_services.Purchase.Services.AbstractService;

public class Transaction {
    double price;
    AbstractService service;
     User user;

    public Transaction(double price, AbstractService service, User user) {
        this.price = price;
        this.service = service;
        this.user = user;
    }


    public AbstractService getService() {
        return service;
    }

    public void setService(AbstractService service) {
        this.service = service;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
