package level3;

import level3.command.Accelerate;
import level3.command.Brake;
import level3.command.Broker;
import level3.command.Start;
import level3.vehicles.Bicycle;
import level3.vehicles.Car;
import level3.vehicles.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {

    @Test
    void shouldAddOrders() {
        Broker broker = new Broker();
        broker.takeOrder(new Start(new Car()));
        broker.takeOrder(new Accelerate(new Bicycle()));
        broker.takeOrder(new Brake(new Plane()));
        assertEquals(3, broker.getOrders().size());
    }

    @Test
    void shouldClearOrdersAfterExecutingThem() {
        Broker broker = new Broker();
        broker.takeOrder(new Start(new Car()));
        broker.takeOrder(new Accelerate(new Bicycle()));
        broker.takeOrder(new Brake(new Plane()));
        broker.executeOrders();
        assertEquals(0, broker.getOrders().size());
    }
}
