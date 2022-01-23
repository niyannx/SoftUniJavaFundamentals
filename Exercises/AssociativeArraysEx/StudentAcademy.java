package Exercises.AssociativeArraysEx;

/*
Write a program, which keeps information about students and their grades.
On the first line you will receive number n. After that you will receive n pair of rows. First you will receive the
student&#39;s name, after that you will receive his grade. Check if student already exists, and if not - add him. Keep
track of all grades for each student.
When you finish reading data, keep students with average grade higher or equal to 4.50. Order filtered students by
average grade in descending order.
Print the students and their average grade in format:
&quot;{name} –&gt; {averageGrade}&quot;
 */

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        HashMap<String, ArrayList<Double>> studentsInfo = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!studentsInfo.containsKey(name)) {
                studentsInfo.put(name, new ArrayList<>());
            }

            studentsInfo.get(name).add(grade);
        }

        HashMap<String, Double> finalStudentsInfo = new HashMap<>();

        for (Map.Entry<String, ArrayList<Double>> entry : studentsInfo.entrySet()) {
            double average = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                average += entry.getValue().get(i);
            }

            average = average / entry.getValue().size();

            if (average >= 4.5) {
                finalStudentsInfo.put(entry.getKey(), average);
            }
        }

        finalStudentsInfo.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.printf("%s -> %.2f\n", k.getKey(), k.getValue()));
    }
}
