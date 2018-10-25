import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scannerInt = new Scanner(System.in);
        int givenNumber = scannerInt.nextInt();
        System.out.println("The factorial of this number is: "  + factorio(givenNumber));
    }

    public static int factorio(int givenNumber) {
        int fact = 0;
        fact = 0+1;
        for (int i = 0+1; i <= givenNumber; i++) {
            fact = fact * i;
        }
        return (fact);
    }
}
