package animals;

public class Bird extends Animal {
    int numberOfEggsPerDay;

    public Bird(String name) {
        super(name);
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
