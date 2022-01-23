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

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> data = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

            String name = data.get(0);
            double salary = Double.parseDouble(data.get(1));
            String position = data.get(2);
            String department = data.get(3);
            String email;
            String age = "-1";

            if (data.size() == 5) {
                List<String> currentList = Arrays.stream(data.get(4).split("")).collect(Collectors.toList());

                if (currentList.contains("@")) {
                    email = data.get(4);
                } else {
                    email = "n/a";
                }

            } else if (data.size() < 5) {
                email = "n/a";

            } else {
                email = data.get(4);
            }

            if (data.size() < 6) {

                if (data.size() == 5) {
                    List<String> currentList = Arrays.stream(data.get(4).split(" ")).collect(Collectors.toList());

                    if (!currentList.contains("@")) {
                        age = data.get(4);
                    }
                }

            } else {
                age = data.get(5);
            }

            Employee employee = new Employee(name, salary, position, department, email, age);
            employeeList.add(employee);

            Department currDepartment = new Department(department, salary);
            departmentList.add(currDepartment);
        }

        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        String myDepartment = "";
        double biggestAverageSum = 0;

        for (int i = 0; i < departmentList.size(); i++) {
            String department = departmentList.get(i).getDepartments();

            int counter = 1;
            double currAverageSum = 0;
            double sum = departmentList.get(i).getSalary();

            for (int j = i + 1; j < departmentList.size(); j++) {
                String currDepartment = departmentList.get(j).getDepartments();

                if (department.equals(currDepartment)) {
                    counter++;
                    sum += departmentList.get(j).getSalary();
                }
            }

            if (counter > 1) {
                currAverageSum = sum / counter;
            }

            if (currAverageSum > biggestAverageSum) {
                biggestAverageSum = currAverageSum;
                myDepartment = department;
            }
        }

        System.out.printf("Highest Average Salary: %s\n", myDepartment);

        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals(myDepartment)) {
                System.out.println(employee);
            }
        }
    }
}
