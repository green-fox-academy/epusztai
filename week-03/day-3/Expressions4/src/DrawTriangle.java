import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
            System.out.println("Your number is : ");
            number = scanner.nextInt();
            String star = "";
            for (int i = 0; i < number; i++){
                star = star + "*";
                System.out.println(star);
            }
        }
    }
