package Exercises.ArraysEx;

/*
Write a program to find all the top integers in an array. A top integer is an integer which is bigger than all the
elements to its right.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // loop through the array to see if it's a top
        for (int index = 0; index <= arr.length - 1; index++) {
            int currentNumber = arr[index];

            //винаги елементът на последния индекс ни е топ
            if(index == arr.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }

            //обхождам всички индекси след моя
            //следващото число -> index + 1
            boolean isTop = false; //
            for (int i = index + 1; i <= arr.length - 1; i++) {
                //обходя всички числа след моето
                int nextNumber = arr[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }

            //проверка дали моето число е топ
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
