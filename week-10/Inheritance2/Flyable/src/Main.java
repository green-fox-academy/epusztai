public class Main {
    public static void main(String[] args) {

        Bird redbreast = new Bird("redbreast");
        Helicopter hawker = new Helicopter("hawker seahawk", "green", 1000);

        System.out.println(redbreast);
        redbreast.fly();
        redbreast.land();

        hawker.fly();
        hawker.land();

        hawker.fly();
        hawker.land();
    }
}