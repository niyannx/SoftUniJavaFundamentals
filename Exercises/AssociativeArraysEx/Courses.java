package Exercises.AssociativeArraysEx;

/*
Write a program, which keeps information about courses. Each course has a name and registered students.
You will receive course name and student name, until you receive the command &quot;end&quot;. Check if such course
already exists, and if not - add the course. Register the user into the course. When you do receive the command
&quot;end&quot;, print the courses with their names and total registered users, ordered by the count of registered users in
descending order. For each contest print registered users ordered by name in ascending order.
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String nameOfCourse = input.split(" : ")[0];
            String nameOfStudent = input.split(" : ")[1];

            if (!courses.containsKey(nameOfCourse)) {
                courses.put(nameOfCourse, new ArrayList<>());
            }

            courses.get(nameOfCourse).add(nameOfStudent);

            input = scan.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
