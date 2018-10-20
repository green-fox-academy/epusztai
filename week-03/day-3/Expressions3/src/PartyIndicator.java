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
