package repo.station;

import repo.domain.Order;
import repo.step.Step;

public abstract class Station {
    String stationId;
    String location;

    public Station(String stationId, String location) {
        this.stationId = stationId;
        this.location = location;
    }

    void powerOn(){
        System.out.println("\n전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    public abstract boolean canHandle(Step step);
    public abstract void execute(Step step, Order order);
}
