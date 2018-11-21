public class SharpieMain {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("green", 0.3f);
        System.out.println(sharpie);
        sharpie.use();
        System.out.println(sharpie.toString());
    }
}
