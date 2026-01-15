package payment;

public class Cash implements Payment {
    @Override
    public void pay(int price) {
        System.out.println("현금결재" + price);
    }
}
