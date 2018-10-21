import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Your number is : ");
        number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
