public class Teacher {
    String name;
    String subject;
    int answeredQuestions;
    int material;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        answeredQuestions = 0;
        material = 0;
    }

    public void teach(Student name) {
        name.learn();
        material++;
    }

    public void answer() {
        answeredQuestions++;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", answeredQuestions=" + answeredQuestions +
                ", material=" + material +
                '}';
    }
}

