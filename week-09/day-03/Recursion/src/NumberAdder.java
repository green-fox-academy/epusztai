public class NumberAdder {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    public static void main(String[] args) {
        int number = 3;
        System.out.println(addNumber(number));
    }

    public static int addNumber (int number) {
        if (number == 1) {
            return 1;
        } else {
            return addNumber(number - 1) + number;
        }
    }
}
