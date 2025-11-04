package level3;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        addVehicleOrders(broker, new Car());
        addVehicleOrders(broker, new Bicycle());
        addVehicleOrders(broker, new Plane());
        addVehicleOrders(broker, new Ship());

        broker.executeOrders();
    }

    private static void addVehicleOrders(Broker broker, Vehicle vehicle) {
        broker.takeOrder(new Start(vehicle));
        broker.takeOrder(new Accelerate(vehicle));
        broker.takeOrder(new Brake(vehicle));
    }
}
