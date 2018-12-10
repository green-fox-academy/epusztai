package animals;

public abstract class Animal {
    String name;
    int age;
    int numberOfLimbs;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public abstract String typeOfFood();
}