public class String3 {
    public static void main(String[] args) {
        String text = "Greenfox";
        System.out.print(separateCharsByStar(text));
    }

    public static String separateCharsByStar(String text) {
        if (text.length() > 1) {
            return text.charAt(0) + "*" + separateCharsByStar(text.substring(1));
        }
        return text;
    }
}
