public class Helicopter extends Vehicle implements Flyable {

    public Helicopter(String type, String color, int weight) {
        super(type, color, weight);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {
        System.out.println(getType() + " flies high with its propeller powered by engines.");

    }

    @Override
    public void takeOff() {

    }

    @Override
    public String toString() {
        return getType();
    }
}
