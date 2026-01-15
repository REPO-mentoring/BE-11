package repo.Payable;

public class CardPayment implements Payable {

    @Override
    public void pay(int amount){
        System.out.println(amount + "카드로 결제합니다");
    }
}
