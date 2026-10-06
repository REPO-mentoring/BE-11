import Station.Station;
import payment.Order;
import step.Step;

import java.util.ArrayList;
import java.util.List;
public class CoffeeShopSystem {
    private List<Station> stations = new ArrayList<>();



    public void addStation(Station station) {
        stations.add(station);
    }

    private Station findStation(Step step) {
        for (Station s : stations) {
            if (s.canHandle(step)) return s;
        }
        return null;
    }

    public void process(Order order) {
        order.printSummary();
        System.out.println("\n");
        order.getPayment().pay(order.getPrice());
        System.out.println("\n");

        for (Step step : order.getSteps()) {
            Station handler = findStation(step);
            if (handler != null) {
                handler.execute(step, order);
            } else {
                System.out.println("처리 가능한 스테이션이 없습니다.");
            }
        }
        System.out.println("주문 완료");
    }


}