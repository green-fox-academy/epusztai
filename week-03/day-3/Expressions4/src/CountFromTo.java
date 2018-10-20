import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int number1 = intInput.nextInt();
        System.out.println("Please enter the second number:");
        int number2 = intInput.nextInt();

        if (number2 <= number1) {
            System.out.println("The second number should be bigger");
        } else {
            int difference = number2 - number1;
            for (int i=0; i<difference; i++){
                System.out.println(number1+i);
            }
        }
    }
}