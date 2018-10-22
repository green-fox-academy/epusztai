import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("How many numbers would you like to type in?");

        int types = scannerInput.nextInt();
        int sum = 0;
        int number;

        for (int a = 0; a < types; a++){
            System.out.println("Enter a number:");
            number = scannerInput.nextInt();
            sum = sum + number;
        }
        double average = sum / types;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}
