package repo.station;

import repo.domain.Order;
import repo.step.BakeStep;
import repo.step.Step;

public class OvenStation extends Station {
    public OvenStation(String stationId, String location) {
        super(stationId, location);
    }
    @Override
    public boolean canHandle(Step step) {
        return step instanceof BakeStep;

    }
    public void execute(Step step, Order order){
        powerOn();
        System.out.println(getClass().getSimpleName() + " 처리: " + step.name());
        step.run(order);
        powerOff();
    }
}
