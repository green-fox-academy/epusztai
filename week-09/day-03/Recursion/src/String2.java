public class String2 {
    public static void main(String[] args) {
        String text = "This is a text and the Excalibur was the sword of King Arthur.";
        int length = text.length();
        System.out.print(replaceXtoEmpty(text, length));
    }

    public static String replaceXtoEmpty(String text, int length) {
        if (length == 0) {
            return "";
        }
        else if (text.charAt(length - 1) == ('x')) {
            return replaceXtoEmpty(text, length - 1) + "";
        }  else {
            return replaceXtoEmpty(text, length - 1) + text.charAt(length - 1);
        }
    }
}
