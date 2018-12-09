public class Gnirts implements CharSequence {
    String field;

    public Gnirts(String field) {
        this.field = field;
    }

    @Override
    public int length() {
        int length = field.length();
        return length;
    }

    @Override
    public char charAt(int index) {
        char newChar = field.charAt(field.length() - index - 1);
        return newChar;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String subSequence = (String) field.subSequence(end, start);
        return subSequence;
    }
}
