import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeTable, counter, total;

        System.out.println("What multiplication table would you like to view?");
        timeTable = scanner.nextInt();
        System.out.println("To what value would you like to display to?");
        counter = scanner.nextInt();

        for (int i = 0; i <= counter; i++) {
            total = timeTable * i;
            System.out.println(timeTable + " x " + i + " = " + total);
        }
    }
}
