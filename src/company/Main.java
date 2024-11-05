package company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");

        Director director = new Director("Nora", "Management", 120000, 50000);
        director.allocatedBudget(10000);
        System.out.println(director);

        Engineer engineer = new Engineer("Dana", "Almarri", 22, new ArrayList<>(Arrays.asList("Java", "C++")));
        engineer.newSkill("Python");
        engineer.newSkill("Javascript");
        engineer.newSkill("HTML");
        System.out.println(engineer);

        SalesPerson salesPerson = new SalesPerson("Waleed", "Sales", 70000, 150);
        salesPerson.updateSalesTarget(200);
        System.out.println(salesPerson);

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
    }
}