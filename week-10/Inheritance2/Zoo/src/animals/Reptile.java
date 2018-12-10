package animals;

public class Reptile extends Animal {
    int numberOfEggs;

    public Reptile(String name) {
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
