import repo.CoffeeShopSystem;
import repo.Payable.CardPayment;
import repo.Payable.Payable;
import repo.domain.Order;
import repo.station.BlenderStation;
import repo.station.EspressoStation;
import repo.station.OvenStation;
import repo.station.Station;
import repo.step.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Station oven = new OvenStation("1","Oven station");
        Station espresso = new EspressoStation("2","Espresso station");
        Station blender = new BlenderStation("3","Blender station");


        List<Station> stations = List.of(
                espresso,
                blender
        );
        List<Step> steps = List.of(
                new BlendStep(),
                new ExtractEspressoStep(),
                new SteamMilkStep(),
                new GrindBeansStep()
        );
        Payable payment = new CardPayment();

        Order order = new Order("주문1","라떼",4500,steps,payment);

        CoffeeShopSystem system = new CoffeeShopSystem(stations);
        system.process(order);

        System.out.println("\n주문 완료");
    }
}
