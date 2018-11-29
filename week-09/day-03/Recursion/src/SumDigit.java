public class SumDigit {
    public static void main(String[] args) {
        int n = 235;
        System.out.println(sumDigit(n));
    }

    public static int sumDigit(int number) {
        if (number == 0) {
            return 0;
        } else {
            return sumDigit(number / 10) + number % 10;
        }
    }
}
