public class Main {

    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "BME");
        Student johnLeClone;

        johnLeClone = john.clone();

        System.out.println("This is the clone person's introduction:");
        johnLeClone.introduce();
    }
}
