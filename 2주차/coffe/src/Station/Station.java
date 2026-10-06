package Station;

import payment.Order;
import step.Step;

public abstract class Station {
    protected String stationId;
    protected String location;

    public Station(String stationId, String location) {
        this.stationId = stationId;
        this.location = location;
    }

    public void powerOn() {
        System.out.println(stationId + " 전원 ON");
    }

    public void powerOff() {
        System.out.println(stationId + " 전원 OFF");
    }

    public abstract boolean canHandle(Step step);

    public void execute(Step step, Order order) {
        powerOn();
        System.out.println(this.getClass().getSimpleName() + " 처리: " + step.name());

        step.run(order);

        powerOff();
        System.out.println();
    }
}