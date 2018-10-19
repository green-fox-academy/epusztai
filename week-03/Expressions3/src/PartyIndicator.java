import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number of the girls:");
        int girls = scanner.nextInt();

        System.out.println("The number of the boys:");
        int boys = scanner.nextInt();

        int everybody = girls + boys;

        if ((girls == boys) && (everybody >= 20)) {
            System.out.println("The party is excellent!");
        } else if ((girls != boys) && (everybody >= 20)) {
            System.out.println("Quite cool party!");
        } else if (everybody < 20) {
            System.out.println("Average party ...");
        }
        if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}

// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people