public class Reverse {

    public static void main(String... args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        StringBuilder reversed1 = new StringBuilder();
        reversed1.append(reversed);
        reversed1 = reversed1.reverse();

        System.out.println(reversed1);
    }
}
