package Labs.DataTypesLab;

/*
Read two names and a delimiter. Print the names joined by the delimiter.
 */

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String action = scan.nextLine();

        StringBuilder output = new StringBuilder();
        output.append(name1);
        output.append(action);
        output.append(name2);
        System.out.println(output);
    }
}
