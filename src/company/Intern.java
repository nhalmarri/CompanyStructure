package company;

public class Intern extends Employee {
    private String university;

    public Intern(String name, String department, double salary, String university) {
        super(name, department, salary);
        this.university = university;
    }

    // Getter and setter for university

    @Override
    public String toString() {
        return super.toString() + ", University: " + university;
    }
}