public class Bunnies {
    public static void main(String[] args) {
        int numberOfTheBunnies = 10;
        System.out.println(sumEars(numberOfTheBunnies));
    }

    public static int sumEars(int number) {
        int ears = 2;
        if (number == 0) {
            return 0;
        } else {
            return sumEars(number - 1) + ears;
        }
    }
}
