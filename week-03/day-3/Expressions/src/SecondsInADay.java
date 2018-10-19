
public class SecondsInADay {

    public static void main(String[] args) {

        int h = 14; //currentHours
        int m = 34; //currentMinutes
        int s = 42; //currentSeconds

        int a = (24*60*60)-((h*60*60)+(m*60)+s);
        System.out.println(a);

    }
}
