public abstract class Vehicle {
    private String type;
    private String color;
    private int weight;

    public Vehicle(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = 1000;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
