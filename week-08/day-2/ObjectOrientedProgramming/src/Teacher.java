public class Teacher {
    String name;
    String subject;
    int ansQuestions;
    int material;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        ansQuestions = 0;
        material = 0;
    }

    public void teach(Student name) {
        name.learn();
        material++;
    }

    public void answer() {
        ansQuestions++;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", answeredQuestions=" + ansQuestions +
                ", material=" + material +
                '}';
    }
}
