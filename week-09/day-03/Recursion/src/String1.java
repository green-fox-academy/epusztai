public class String1 {
    public static void main(String[] args) {
        String text = "This is a text and the Excalibur was the sword of King Arthur.";
        int length = text.length();
        System.out.print(replaceXtoY(text, length));
    }

    public static String replaceXtoY(String text, int length) {
        if (length == 0) {
            return "";
        }
        else if (text.charAt(length - 1) == ('x')) {
            return replaceXtoY(text, length - 1) + "y";
        }  else {
            return replaceXtoY(text, length - 1) + text.charAt(length - 1);
        }
    }
}
