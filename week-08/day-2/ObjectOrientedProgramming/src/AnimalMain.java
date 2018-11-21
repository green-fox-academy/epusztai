public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal snake = new Animal();
        Animal crocodile = new Animal();

        System.out.println(cat);
        cat.eat();
        System.out.println(cat);

        System.out.println(snake);
        snake.play();
        System.out.println(snake);

        System.out.println(crocodile);
        crocodile.drink();
        System.out.println(crocodile);
    }
}
