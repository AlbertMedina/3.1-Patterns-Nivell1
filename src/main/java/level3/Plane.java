package level3;

public class Plane extends Vehicle {

    @Override
    public void start() {
        System.out.println("Plane starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Plane accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Plane braking");
    }
}
