package software.fawry_services.Purchase.Payment.Billing;


import software.fawry_services.Purchase.Payment.*;
import software.fawry_services.Purchase.Services.*;

import java.util.HashSet;
import java.util.Set;

public class Billing {
    AbstractPayment payment;
    AbstractService abstractService;

    public Billing() {

    }

    private Billing(String serviceProvider, double amount, String serviceType, String paymentway)
    {
        AbstractPayment tmp = null;
        switch (serviceType){
            case "Donations":
                this.abstractService=new Donations(amount,serviceProvider);
                break;
            case "InternetRecharge":
                this.abstractService=new InternetRecharge(amount,serviceProvider);
                break;
            case "LandLine":
                this.abstractService=new LandLine(amount,serviceProvider);
                break;
            case "MobileRecharge":
                this.abstractService=new MobileRecharge(amount,serviceProvider);
                break;
            case "WalletRecharge":
                this.abstractService=new WalletRecharge(amount,serviceProvider);
                break;
            default:break;
        }

        switch (paymentway){
            case "Cash":
                tmp=new CashPayment(abstractService);
                break;
            case "CreditCard":
               tmp=new CreditCardPayment(abstractService);
                break;
            case "Wallet":
                tmp=new WalletPayment(abstractService);
                break;
            default:break;
        }
        this.payment= tmp;


    }
    public AbstractPayment createBill(String serviceProvider, double amount, String serviceType, String paymentway)
    {
        Set <String> service= new HashSet<>();
        service.add("MobileRecharge");
        service.add( "WalletRecharge");
        service.add("LandLine");
        service.add("InternetRecharge");
        service.add("Donations");

        Set <String> payment= new HashSet<>();
        service.add("Cash");
        service.add("CreditCard");
        service.add("Wallet");

        if(service.contains(serviceType) && payment.contains(paymentway))
        {
            new Billing(serviceProvider,amount,serviceType,paymentway);
            return getPayment();
        }
        else return null;
    }

    public AbstractPayment getPayment() {
        return payment;
    }

    public void setPayment(AbstractPayment payment) {
        this.payment = payment;
    }

    public AbstractService getAbstractService() {
        return abstractService;
    }

    public void setAbstractService(AbstractService abstractService) {
        this.abstractService = abstractService;
    }


}
