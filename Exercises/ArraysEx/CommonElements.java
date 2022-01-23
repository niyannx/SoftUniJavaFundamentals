package Exercises.ArraysEx;

/*
Write a program, which prints common elements in two arrays. You have to compare the elements of the second
array to the elements of the first.
 */

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr1 = scan.nextLine().split(" ");
        String[] arr2 = scan.nextLine().split(" ");

        StringBuilder common = new StringBuilder();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])) {
                    common.append(arr2[i]);
                    common.append(" ");
                }
            }
        }
        System.out.println(common);
    }
}
