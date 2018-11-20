public class DivideByZero {

    public static void main(String[] args) {
        int number = 0;
        divide(number);
    }

    public static void divide (int x) {
        int divisor = 0;
        try {
            divisor = 10 / x;
        } catch (ArithmeticException ArEx) {
            System.out.println("Divide by zero: fail");
        }
        System.out.println(divisor);
    }
}
