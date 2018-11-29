import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 45, 78, 97, 125);
        List<Integer> evens = evenNumbers(numbers);
        System.out.println(evens);
    }

    static List<Integer> evenNumbers(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evens.add(numbers.get(i));
            }
        }
        return evens;
    }
}
