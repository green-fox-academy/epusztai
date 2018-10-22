import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        int Number = 8;
        System.out.println("I'm thinking of a number. Guess what it is? :");
        int guess = intInput.nextInt();

        while (Number != guess) {
            if (Number > guess) {
                System.out.println("The stored number is higher!");
            } else {
                System.out.println("The stored number is lower!");
            }
            guess = intInput.nextInt();
        }
        System.out.println("You've found the number!");
    }
}