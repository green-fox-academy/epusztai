public class Bunny2 {
    public static void main(String[] args) {
        int bunnies = 4 ;
        System.out.println(numberOfTheEars(bunnies));
    }

    public static int numberOfTheEars(int bunnies) {
        int odd = 3;
        int even = 2;
        if (bunnies == 1) {
            return 2;
        } else if (bunnies % 2 == 0) {
            return numberOfTheEars(bunnies - 1) + odd;
        } else {
            return numberOfTheEars(bunnies - 1) + even;
        }
    }
}
