import java.util.Arrays;
import java.util.List;

public class BiggestNumberWithArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(125, 256, 87, 987, 343);
        System.out.println("The biggest number is: " + biggestNumber(numbers));
    }

    public static int biggestNumber(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
