public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public String breed() {
        return "laying eggs.";
    }

    public void fly() {
        System.out.println(name + " flies high.");
    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }
}