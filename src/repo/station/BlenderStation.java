package repo.station;

import repo.domain.Order;
import repo.step.*;

public class BlenderStation extends Station {

    public BlenderStation(String stationId, String location) {
        super(stationId, location);
    }

    @Override
    public boolean canHandle(Step step) {
        return step instanceof BlendStep
                ||step instanceof SteamMilkStep;
    }
    public void execute(Step step, Order order){
        powerOn();
        System.out.println(getClass().getSimpleName() + " 처리: " + step.name());
        step.run(order);
        powerOff();
    }
}
