package step;

import payment.Order;

public interface Step {
    public void run(Order order);
    String name();
}
