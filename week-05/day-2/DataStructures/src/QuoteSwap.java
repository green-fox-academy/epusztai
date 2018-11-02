import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println(quoteSwap(list));
    }

    public static String quoteSwap(ArrayList<String> list2){
        list2.set(2, "cannot");
        list2.set(5, "do");
        String newList = "";
        for (int i = 0; i < list2.size() ; i++) {
            list2.set(i, list2.get(i) + " ");
            newList += list2.get(i);
        } return newList;
    }
}
