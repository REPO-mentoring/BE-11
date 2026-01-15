package repo.step;

import repo.domain.Order;

public class BakeStep implements Step {

    @Override
    public void run(Order order) {
        System.out.println("굽기 시작!");
    }

    @Override
    public String name() {
        return "굽기";
    }
}
