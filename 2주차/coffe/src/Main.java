import Station.EspressoStation;
import payment.CreditCard;
import payment.Order;
import step.*;

public class Main {
    public static void main(String[] args) {
        CoffeeShopSystem system = new CoffeeShopSystem();

        system.addStation(new EspressoStation("에스프레소_머신1", "Esspresso"));

        Order order = new Order("주문1", "라떼", 4500, new CreditCard());

        order.addStep(new GrindBeansStep());
        order.addStep(new ExtractEspressoStep());
        order.addStep(new SteamMilkStep());

        system.process(order);
    }
}