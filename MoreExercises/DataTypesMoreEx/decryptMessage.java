package MoreExercises.DataTypesMoreEx;

/*
You will receive a key (integer) and n characters afterward. Add the key to each of the characters and append them
to message. At the end print the message, which you decrypted.
 */

import java.util.Scanner;

public class decryptMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = scan.next().charAt(0);
            ch += key;
            decoded.append(ch);
        }
        System.out.println(decoded);
    }
}
