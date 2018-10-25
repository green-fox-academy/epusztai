import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scannerInt = new Scanner(System.in);
        int givenNumber = scannerInt.nextInt();
        System.out.println("The sum of all, till the given number is: "  + sum(givenNumber));
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return (sum);
    }
}
