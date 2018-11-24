import java.util.ArrayList;
import java.util.List;

public class TeacherStudentMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Irene", "English");
        Teacher teacher2 = new Teacher("John", "Math");
        Student student1 = new Student("Peter");
        Student student2 = new Student("Mary");

        System.out.println(teacher1);
        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(student1);
        System.out.println(teacher2);
        System.out.println(student2);

        teacher1.teach(student1);
        student1.question(teacher1);
        teacher1.teach(student2);
        student2.question(teacher2);

        System.out.println(teacher1);
        System.out.println(student1);
        System.out.println(teacher2);
        System.out.println(student2);
    }
}
