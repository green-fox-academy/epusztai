import java.util.Scanner;

public class MileToKmConverter {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type the distance in kilometers:");

            int userInput2 = scanner.nextInt();
            double mi = 1.609344; //1 mi= 1,609344 km

            System.out.println(userInput2 / mi + " mi");

            // Write a program that asks for an integer that is a distance in kilometers,
            // then it converts that value to miles and prints it
        }
    }
