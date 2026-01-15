package repo.step;

import repo.domain.Order;

public class GrindBeansStep implements Step {
    @Override
    public void run(Order order) {
        System.out.println("원두 갈기");
    }

    @Override
    public String name(){
        return "원두";
    }
}
