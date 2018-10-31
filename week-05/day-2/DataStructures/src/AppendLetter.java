import java.util.*;

public class AppendLetter {
    public static void main(String... args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));

    }

    public static List appendA(List animals) {
        for (int i = 0; i < animals.size(); i++) {
            animals.set(i, (animals.get(i) + "a"));
        }
        return animals;
    }
}
