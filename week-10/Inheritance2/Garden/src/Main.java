public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.addPlant(new Flower("yellow"));
        garden.addPlant(new Flower("blue"));
        garden.addPlant(new Tree("purple"));
        garden.addPlant(new Tree("orange"));

        System.out.println(garden.printState());

        garden.water(40);
        System.out.println(garden.printState());

        garden.water(70);
        System.out.println(garden.printState());
    }
}
