public class Power {
    public static void main(String[] args) {
        int base = 2;
        int n = 8;
        System.out.println(powerN(base, n));
    }

    public static int powerN(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return powerN(base, n - 1) * base;
        }
    }
}
