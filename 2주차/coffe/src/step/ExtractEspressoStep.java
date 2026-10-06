package step;

import payment.Order;

public class ExtractEspressoStep  implements Step {

    @Override
    public void run(Order order) {
        System.out.println("샷 추출중");
    }

    @Override
    public String name() {
        return "샷 추출";
    }
}
