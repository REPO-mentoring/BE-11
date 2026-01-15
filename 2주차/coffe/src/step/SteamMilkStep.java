package step;

import payment.Order;

public class SteamMilkStep implements Step{
    @Override
    public void run(Order order) {
        System.out.println("우유 스팀중");
    }

    @Override
    public String name() {
        return "우유 스팀";
    }
}
