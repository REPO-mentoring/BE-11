package repo.step;

import repo.domain.Order;

public class BlendStep implements Step {

    @Override
    public void run(Order order) {
        System.out.println("블렌딩 시작");
    }
    @Override
    public String name(){
        return "블랜드";
    }
}
