public class Student {
    String name;
    int knowledge;
    int questions;

    public Student(String name) {
        this.name = name;
        questions = 0;
        knowledge = 0;
    }

    public void learn() {
        knowledge++;

    }

    public void question(Teacher name) {
        name.answer();
        questions++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", knowledge=" + knowledge +
                ", questions=" + questions +
                '}';
    }
}
