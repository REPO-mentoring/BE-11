package step;

import payment.Order;

public class BakeStep implements Step {


    @Override
    public void run(Order order) {
        System.out.println("굽는중");
    }

    @Override
    public String name() {
        return "굽기";
    }

}
