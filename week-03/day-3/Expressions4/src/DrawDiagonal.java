import java.util.Scanner;
public class DrawDiagonal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Please enter your number: ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((j == 0) || (j == number - 1) || (i == j) || (i == 0) || (i == number - 1)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}