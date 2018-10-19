import java.util.Scanner;

public class HelloUser {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name:");
            // The program stops and waits for user input and to press enter
            String userInput1 = scanner.nextLine();

            // It prints the whole line that was given by the user
            System.out.println("Hello, " + userInput1 + "!");

        }
    }

