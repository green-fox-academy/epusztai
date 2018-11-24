public class PetrolStationMain {
    public static void main(String[] args) {
        Station station = new Station(1000);
        Car trabant = new Car();
        Car skoda = new Car();

        System.out.println(station);
        System.out.println(trabant);
        System.out.println(skoda);

        station.refill(trabant);
        station.refill(skoda);

        System.out.println(station);
        System.out.println(trabant);
        System.out.println(skoda);
    }
}
