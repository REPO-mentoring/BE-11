package payment;

public class CreditCard implements Payment {
    @Override
    public void pay(int price) {
        System.out.println("카드결재"+price);
    }
}
