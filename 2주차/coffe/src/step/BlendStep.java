package step;

import payment.Order;

public class BlendStep implements Step {
    @Override
    public void run(Order order) {
        System.out.println("블렌딩");
    }

    @Override
    public String name() {
        return "블렌딩";
    }
}
