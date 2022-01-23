package Labs.BasicSyntaxLab;

/*
Every time John tries to pay his bills he sees on the cash desk the sign: &quot;I will be back in 30 minutes&quot;. One day John
was sick of waiting and decided he needs a program, which prints the time after 30 minutes. That way he won’t
have to wait on the desk and come at the appropriate time. He gave the assignment to you, so you have to do it.
 */

import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 30;
        if (minutes > 59) {
            minutes = minutes - 60;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:0%d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }
    }
}
