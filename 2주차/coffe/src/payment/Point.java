package payment;

public class Point implements Payment {
    @Override
    public void pay(int price) {
        System.out.println("포인트 결재" + price);
    }
}
