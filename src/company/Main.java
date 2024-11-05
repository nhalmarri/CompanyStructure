package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
    }
}