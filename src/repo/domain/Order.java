package repo.domain;

import repo.Payable.Payable;
import repo.station.Station;
import repo.step.Step;

import java.util.List;

public class Order {
    private final String orderId;
    private final String menuName;
    private final int price;
    private final List<Step> steps;
    private final Payable payment;

    public Order(String orderId, String menuName, int price, List<Step> steps, Payable payment) {
        this.orderId = orderId;
        this.menuName = menuName;
        this.price = price;
        this.steps = steps;
        this.payment = payment;
    }

    public void printSummary() {
        System.out.println("주문번호: " + orderId);
        System.out.println("메뉴: " + menuName);
        System.out.println("가격: " + price + "원");
        System.out.println("결제수단: " + payment.getClass().getSimpleName());
    }

    public Payable getPayment() {
        return payment;
    }

    public List<Step> getSteps() {
        return steps;
    }

}
