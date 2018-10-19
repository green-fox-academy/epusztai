public class ConditionVariableMutation {

    public static void main(String[] args) {
        //1.
        double a = 24;
        int out = 0;
        if (a % 2 == 0) {
            out++;
        }
        System.out.println(out);

        //2.
        int b = 21;
        String out2 = "";
        if (b < 10) {
            out2 = "Less!";
        } else if (b > 20) {
            out2 = "More!";
        } else {
            out2 = "Sweet!";
        }
        System.out.println(out2);

        //3.
        int c = 123;
        int credits = 20;
        boolean isBonus = true;

        if ((credits >= 50) && (isBonus == false)) {
            c -= 2;
        } else if ((credits < 50) && (isBonus == false)) {
            c -= 1;
        }

        System.out.println(c);

        int d = 8;
        int time = 120;
        String out3 = "";
        if ((d % 4 ==0 ) && (time <= 200)) {
            out3 = "Check";
            System.out.println(out3);
        }
        else if (time>200) {
            out3 = "Time out";
            System.out.println(out3);
        }
        else {
            out3 = "Run forest Run!";
            System.out.println(out3);
        }
    }
}






