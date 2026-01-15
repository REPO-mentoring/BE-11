package repo;

import repo.domain.Order;
import repo.station.Station;
import repo.step.Step;

import java.util.List;

public class CoffeeShopSystem {
    public List<Station> stations;

    public CoffeeShopSystem(List<Station> stations) {
        this.stations = stations;
    }

    public void process(Order order) {
        order.printSummary();
        int price = 5000;
        order.getPayment().pay(price);
        for (Step step:order.getSteps()) {
            for (Station station : stations) {
                if (station.canHandle(step)) {
                    station.execute(step, order);
                    break;
                }
            }
        }
    }
}
