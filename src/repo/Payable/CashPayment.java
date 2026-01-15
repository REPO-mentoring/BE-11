package repo.Payable;

public class CashPayment implements Payable {

    @Override
    public void pay(int amount){
        System.out.println(amount + "현금 결제시작");
    }
}
