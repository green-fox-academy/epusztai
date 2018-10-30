public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String Add0 = "My todo:\n";
        String Add1 = " - Download games\n";
        String Add2 = "    - Diabolo\n";
        String todoText2 = Add0 + todoText + Add1 + Add2;
        System.out.println(todoText2);
    }
}
