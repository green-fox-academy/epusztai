public class SharpieMain {

    public static void main(String[] args) {
        Sharpie green = new Sharpie("green", 5f);
        Sharpie blue = new Sharpie("blue", 7f);
        Sharpie red = new Sharpie("red", 10f);
        Sharpie black = new Sharpie("black", 5f);


        SharpieSet firstSet = new SharpieSet();

        firstSet.add(green);
        firstSet.add(blue);
        firstSet.add(red);
        firstSet.add(black);

        firstSet.print();
        System.out.println();

        green.use();
        blue.use();
        red.use();
        black.use();

        firstSet.print();

        System.out.println(firstSet.countUsable());

        firstSet.removeTrash();

        firstSet.print();
    }
}
