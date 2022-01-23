package Exercises.AssociativeArraysEx;

/*
Write a program which keeps information about companies and their employees.
You will receive company name and employee&#39;s id, until you receive the command &quot;End&quot;. Add each employee to
the given company. Keep in mind that a company cannot have two employees with the same id.
When you finish reading data, order the companies by the name in ascending order.
Print the company name and each employee&#39;s id in the following format:
{companyName}
-- {id1}
-- {id2}
-- {idN}
 */

import java.util.*;

public class Company {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        TreeMap<String, List<String>> companies = new TreeMap<>();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String ID = input.split(" -> ")[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<>());
            }

            if (!employeeAlreadyExists(ID, companies.get(companyName))) {
                companies.get(companyName).add(ID);
            }
            input = scan.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.printf("%s\n", entry.getKey());

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s\n", entry.getValue().get(i));
            }
        }
    }

    public static boolean employeeAlreadyExists(String ID, List<String> employeeIDs) {
        for (String employeeID : employeeIDs) {
            if (employeeID.equals(ID)) {
                return true;
            }
        }
        return false;
    }
}
