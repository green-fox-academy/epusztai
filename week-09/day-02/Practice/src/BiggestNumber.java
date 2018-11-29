public class BiggestNumber {
    public static void main(String[] args) {

        int[] numbers = {2, 45, 78, 9, 89, 9};

        System.out.println("The biggest number is: " + biggest(numbers));
    }

    public static int biggest(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
