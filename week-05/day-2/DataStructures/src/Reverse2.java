public class Reverse2 {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String newReversed = "";
        for (int index = reversed.length() - 1; index >= 0; index--) {
            newReversed = newReversed + reversed.charAt(index);
        }
        System.out.println(newReversed);
    }
}
