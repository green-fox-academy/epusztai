public class Counter {
    public static void main(String[] args) {
        int number = 10;
        countDown(number);
    }

    public static void countDown (int number) {
        if (number > 0) {
            countDown(number - 1);
        }
        System.out.println(number);
    }
}
