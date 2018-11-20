import java.util.ArrayList;

public class ExceptionMain {

    public static void main(String[] args) {
        int alma = 23;
        double zero = 0;
        try {
            zero = 10 / 0;
        } catch (ArithmeticException arEx) {
            System.out.println("You tried to divide by 0");
            arEx.printStackTrace();
        }
        System.out.println(zero);

        ArrayList<String> myList = null;
        try {
            myList.add("hello");
            myList = new ArrayList<>();
            System.out.println(myList.get(1));
        } catch (IndexOutOfBoundsException indexOEx) {
            System.out.println(indexOEx);
            System.out.println("Something went wrong with array");
            indexOEx.printStackTrace();
        } catch (NullPointerException nullEx) {
            System.out.println("You tried to operate with a null");
        } finally {
            System.out.println("I can close resources here.");
        }

    }
}