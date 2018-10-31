import java.util.ArrayList;

public class Candyshop {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println(sweets(arrayList));
    }

    public static ArrayList<String> sweets(ArrayList sweeties) {
        sweeties.set(sweeties.indexOf(2), "Croissant");
        sweeties.set(sweeties.indexOf(false), "Ice cream");
        return sweeties;
    }
}
