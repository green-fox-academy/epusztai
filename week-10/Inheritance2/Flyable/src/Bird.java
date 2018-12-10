import animals.Animal;

public class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String typeOfFood() {
        return null;
    }

    public void fly() {
        System.out.println(getName() + " flies high.");
    }

    @Override
    public void land() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public String toString() {
        return getName();
    }
}