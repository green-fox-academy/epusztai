import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Your number is : ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i += 2) {
            for (int j = 0; j < number -1 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n"); }

        for (int i = number - 3; i > 0; i -= 2) {
            for (int j = 0; j < number -1 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
