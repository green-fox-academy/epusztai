public class Shifter implements CharSequence {
    int number;
    String field;

    public Shifter(int number, String field) {
        this.number = number;
        this.field = field;
    }

    @Override
    public int length() {
        int length = length();
        return length;

    }

    @Override
    public char charAt(int index) {
        char newChar = field.charAt(index + number);
        return newChar;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
