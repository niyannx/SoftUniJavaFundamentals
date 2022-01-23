package MoreExercises.ObjectsAndClassesMoreEx.CompanyRoster;

/*
Define a class Employee that holds the following information: name, salary, position, department, email and age.
The name, salary, position and department are mandatory while the rest are optional.
Your task is to write a program which takes N lines of employees from the console and calculates the department
with the highest average salary and prints for each employee in that department his name, salary, email and age –
sorted by salary in descending order. If an employee doesn’t have an email – in place of that field you should print
&quot;n/a&quot; instead, if he doesn’t have an age – print &quot;-1&quot; instead. The salary should be printed to two decimal places
after the seperator.
 */

public class Department {
    private String departments;
    private double salary;

    public Department(String departments, double salary){
        this.departments=departments;
        this.salary =salary;
    }

    public String getDepartments() {
        return departments;
    }

    public double getSalary() {
        return salary;
    }
}
