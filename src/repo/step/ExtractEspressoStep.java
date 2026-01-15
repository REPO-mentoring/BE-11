package repo.step;

import repo.domain.Order;

public class ExtractEspressoStep implements Step {
    @Override
    public void run(Order order) {
        System.out.println("샷 추출");
    }
    @Override
    public String name(){
        return "샤샷";
    }
}
