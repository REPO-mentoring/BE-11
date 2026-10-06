package payment;
import step.Step;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String menuName;
    private int price;
    private List<Step> steps;
    private Payment payment;

    public Order(String orderId, String menuName, int price, Payment payment) {
        this.orderId = orderId;
        this.menuName = menuName;
        this.price = price;
        this.payment = payment;
        this.steps = new ArrayList<>();
    }

    public void addStep(Step step) { this.steps.add(step); }
    public List<Step> getSteps() { return steps; }
    public Payment getPayment() { return payment; }
    public int getPrice() { return price; }

    public void printSummary() {
        // 예시 포맷에 맞춤
        System.out.println("주문번호: " + orderId);
        System.out.println("메뉴: " + menuName);
        System.out.println("가격: " + price);
    }
}