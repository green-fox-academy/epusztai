package animals;

public class Mammal extends Animal {
    int numberOfSuccessors;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public String typeOfFood() {
        return null;
    }
}
