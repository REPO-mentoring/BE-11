package repo.Payable;

public class PointPayment implements Payable {

    @Override
    public void pay(int amount) {
        System.out.println(amount + "포인트 결제 시작");
    }
}
