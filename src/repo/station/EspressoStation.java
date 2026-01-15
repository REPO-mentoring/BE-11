package repo.station;

import repo.domain.Order;
import repo.step.ExtractEspressoStep;
import repo.step.GrindBeansStep;
import repo.step.Step;

public class EspressoStation extends Station {
    public EspressoStation(String stationId, String location) {
        super(stationId, location);
    }
    @Override
    public boolean canHandle(Step step) {
        return step instanceof ExtractEspressoStep
                ||step instanceof GrindBeansStep;

    }
    public void execute(Step step, Order order){
        powerOn();
        System.out.println(getClass().getSimpleName() + " 처리: " + step.name());
        step.run(order);
        powerOff();
    }
}
