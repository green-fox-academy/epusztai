import animals.Animal;

public class Main {
    public static void main(String[] args) {

        Bird robin = new Bird("Redbreast");
        Helicopter hawker = new Helicopter("Hawker Seahawk", "green", 1000);

        robin.fly();
        hawker.fly();
    }
}
