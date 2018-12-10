package animals;

public class Bird extends Animal {
    int numberOfEggsPerDay;

    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(getName() + " flies high.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String typeOfFood() {
        return null;
    }
}
