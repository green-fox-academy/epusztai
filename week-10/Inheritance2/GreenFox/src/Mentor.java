public class Mentor extends Person {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " " + level + " level mentor.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}
