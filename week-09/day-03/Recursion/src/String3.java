public class String3 {
    public static void main(String[] args) {
        String text = "Greenfox";
        System.out.print(replaceEverySecond(text));
    }

    public static String replaceEverySecond(String text) {
        if (text.length() > 1) {
            return text.charAt(0) + "*" + replaceEverySecond(text.substring(1));
        }
        return text;
    }
}
