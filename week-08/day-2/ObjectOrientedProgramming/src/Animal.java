public class Animal {
    private int hunger;
    private int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }

    public void play() {
        hunger++;
        thirst++;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThurst() {
        return thirst;
    }

    public void setThurst(int thurst) {
        this.thirst = thurst;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hunger=" + hunger +
                ", thurst=" + thirst +
                '}';
    }
}
