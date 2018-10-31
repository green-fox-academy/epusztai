public class PrintParams {
    public static void main(String[] args) {
        printParams ("first");
        printParams ("first", "second");
        printParams ("first", "second", "third", "fourth");
        printParams ("first", "second", "third", "fourth", "fifth");
        printParams ("first", "second", "third", "fourth", "fifth", "sixth");
    }

    public static void printParams(String...parameters){
        for (String p: parameters ) {
            System.out.print(p + ", ");
        }
        System.out.println();
    }
}
