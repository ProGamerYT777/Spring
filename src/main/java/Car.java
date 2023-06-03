
public class Car extends Transport {
    private String model;
    public Car(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println(model + " готов к работе");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}