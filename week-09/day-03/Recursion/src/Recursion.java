public class Recursion {

    public static void main(String[] args) {

        int sum = add(10);
        int sum2 = addWithRecursion(10);
        System.out.println(sum2);
    }

    private static int addWithRecursion(int limit) {
        if (limit > 1) {
            return addWithRecursion(limit - 1) + limit;
        }
        return 1;
    }

    private static int add(int limit) {
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        return  sum;
    }
}
