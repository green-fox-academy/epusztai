public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 8;
        System.out.println(a);

        int b = 100;
        b -= 94;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f1BiggerThanF2 = false;
        System.out.println(f1>f2);
        // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        g2 *= 2;
        boolean g2DoubleBigger = true;
        System.out.println(g2DoubleBigger);
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        h /= 11;
        boolean hDivisor = false;
        System.out.println(hDivisor);

        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        i2 *= 3;
        i2 *= 9;
        System.out.println(true && true);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        j /= 3;
        j /= 5;
        System.out.println(true || false);
        // tell if j is dividable by 3 or 5 (print as a boolean)

        String k = "Apple";
        k = k + k + k + k;
        System.out.println(k);
    }
}
