public class Pickup extends Transport {
    private String model;

    public Pickup(String model) {
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
