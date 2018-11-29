import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddNextNumber {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> getList = addNextNumbers(numbers);
        System.out.println(getList);
    }

    public static List<Integer> addNextNumbers(List<Integer> numbers) {
        List<Integer> getList = new ArrayList<>();
        for (int i = 0; i < numbers.size() - 1; i += 2) {
            int next = numbers.get(i) + numbers.get(i + 1);
            getList.add(next);
        }
            if (numbers.size() % 2 != 0)
            getList.add(numbers.get(numbers.size() - 1));
        return getList;
    }
}
