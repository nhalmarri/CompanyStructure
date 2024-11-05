package company;

import java.util.ArrayList;

public class Engineer extends Employee {


    private ArrayList<String> skills;

    public Engineer(String firstName, String lastName, int age, ArrayList<String> skills) {
        super(firstName, lastName, age);

        this.skills = skills;

    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void newSkill(String skill) {
        skills.add(skill);
    }


    @Override
    public String toString() {

        return super.toString() + "    Engineer ====> "+" skills=" + skills;
    }
}//end of class
