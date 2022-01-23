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

public class Employee {
    private String name;             // mandatory
    private double salary;          // mandatory
    private String position;        // mandatory
    private String department;      // mandatory
    private String email;
    private String age;

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, double salary, String position, String department, String email, String age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %s", this. name, this.salary, this.email, this.age);
    }

}
