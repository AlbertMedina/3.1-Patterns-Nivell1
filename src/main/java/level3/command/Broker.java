package level3.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private final List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return List.copyOf(orders);
    }

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void executeOrders() {
        orders.forEach(Order::execute);
        orders.clear();
    }
}
