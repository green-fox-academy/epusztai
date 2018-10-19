import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number > number2)
            System.out.println(number);

        if (number2 > number)
            System.out.println(number2);

    }
}
