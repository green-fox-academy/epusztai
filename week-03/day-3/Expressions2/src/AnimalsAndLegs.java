import java.util.Scanner;

public class AnimalsAndLegs {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the number of chickens the farmer has:");
            int userInput1 = scanner.nextInt();

            System.out.println("Please enter the number of pigs own by the farmer:");
            int userInput2 = scanner.nextInt();

            int legs = userInput1 * 2 + userInput2 * 4; //The number of the legs

            System.out.println("The number of the legs " + legs);
        }
    }
