package company;

public class Director extends Employee {

    private double budget;

    public Director(String name, String department, double salary, double budget) {
        super(name, department, salary);
        this.budget = budget;

    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void allocatedBudget(double newBudget) {
        if (newBudget <= budget) {
            budget = budget - newBudget;
        }else {
            System.out.println("Insufficient budget!");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"    Director ====>"+" Budget= "+budget;
    }



} //end of class
