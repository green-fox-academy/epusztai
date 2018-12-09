public class Student extends Person implements Clonable {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student clone() {
        Student cloneStudent = new Student(getName(), getAge(), getGender(), previousOrganization);
        return cloneStudent;
    }

    @Override
    public void getGoal() {
        super.getGoal();
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
