import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 45, 78, 97, 125);
        List<Integer> odds = oddNumbers(numbers);
        System.out.println(odds);
    }

    static List<Integer> oddNumbers(List<Integer> numbers) {
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                odds.add(numbers.get(i));
            }
        }
        return odds;
    }
}
