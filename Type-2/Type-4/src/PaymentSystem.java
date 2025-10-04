import org.w3c.dom.ls.LSOutput;

interface  payment{
    void pay(double amount);
    void refund(double amount);
}
 class CreditCardPayment implements payment{
    @Override
    public void pay(double amount){
        System.out.println("payment process is via card:"+amount);
    }
    public void refund(double amount){
        System.out.println("Refund process is via card:"+amount);
    }
}
class UPIPayment implements payment{
    @Override
    public void pay(double amount){
        System.out.println("Payment in process:"+amount);
    }
    public void refund(double amount){
        System.out.println("Refund in process:"+amount);
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
     payment p=new CreditCardPayment();
     p.pay(500);
     p.refund(200);
     payment p2=new UPIPayment();
     p2.pay(100);
     p2.refund(50);
    }
}
