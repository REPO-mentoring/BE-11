package step;

import payment.Order;

public class GrindBeansStep implements Step {
    @Override
    public void run(Order order) {
        System.out.println("원두 가는중");
    }

    @Override
    public String name() {
        return "원두 갈기";
    }

}
