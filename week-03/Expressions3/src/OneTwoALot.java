import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        if (number <= 0)
            System.out.println(number + " Not enough");
        if (number == 1)
            System.out.println(number + " One");
        if (number == 2)
            System.out.println(number + " Two");
        if (number >= 2)
            System.out.println(number + " A lot");

    }
}
