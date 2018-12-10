import animals.Animal;

public class Main {
    public static void main(String[] args) {

        Bird robin = new Bird("redbreast");
        Helicopter hawker = new Helicopter("Hawker Seahawk", "green", 1000);

        System.out.println(robin);
        robin.fly();
        robin.land();
        robin.takeOff();

        System.out.println(hawker);
        hawker.fly();
        hawker.land();
        hawker.takeOff();
    }
}
