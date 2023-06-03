import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    private String name;
    public Transport transport;
    public Car car;
    public Bus bus;
    public Pickup pickup;

    public Driver(String name, Transport transport) {
        this.transport = transport;
        this.name = name;
    }

    public Driver(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }
    @Autowired
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void startTheCar() {
        car.start();
        System.out.println(name + " сел(а) в " + car.getModel());
    }

    public void startTheBus() {
        bus.start();
        System.out.println(name + " сел(а) в " + bus.getModel());
    }

    public void startThePickup() {
        pickup.start();
        System.out.println(name + " сел(а) в " + pickup.getModel());
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
