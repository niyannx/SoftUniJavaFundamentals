package Exercises.BasicSyntaxEx;

/*
You will be given a string representing a username. The password will be that username reversed. Until you receive
the correct password print on the console &quot;Incorrect password. Try again.&quot;. When you receive the correct
password print &quot;User {username} logged in.&quot; However on the fourth try if the password is still not correct
print &quot;User {username} blocked!&quot; and end the program.
 */

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String user = scan.nextLine();
        String input = scan.nextLine();
        int count = 0;
        boolean blocked = false;

        byte[] strAsByte = user.getBytes();
        byte[] pass = new byte[strAsByte.length];

        for (int i = 0; i < strAsByte.length; i++) {
            pass[i] = strAsByte[strAsByte.length - i - 1];
        }

        while (!input.equals(new String(pass))) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", user);
                blocked = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            input = scan.nextLine();
        }

        if (!blocked) {
            System.out.printf("User %s logged in.", user);
        }
    }
}
