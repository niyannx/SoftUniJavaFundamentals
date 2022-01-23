package Exercises.BasicSyntaxEx;

/*
As a MOBA challenger player, Peter has the bad habit to trash his PC when he loses a game and rage quits. His
gaming setup consists of headset, mouse, keyboard and display. You will receive Peter`s lost games count.
Every second lost game, Peter trashes his headset.
Every third lost game, Peter trashes his mouse.
When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
Every second time, when he trashes his keyboard, he also trashes his display.
You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming
equipment.
 */

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int headsetsTrashed = 0;
        int miceTrashed = 0;
        int keyboardsTrashed = 0;
        int displaysTrashed = 0;
        double overall;


        for (int i = 1; i <= lostGames; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                headsetsTrashed++;
                miceTrashed++;
                keyboardsTrashed++;
                if (keyboardsTrashed % 2 == 0) {
                    displaysTrashed++;
                }
            } else if (i % 2 == 0) {
                headsetsTrashed++;
            } else if (i % 3 == 0) {
                miceTrashed++;
            }
        }
        overall = headsetsTrashed * headPrice + miceTrashed * mousePrice + keyboardsTrashed * keyPrice + displayPrice * displaysTrashed;
        System.out.printf("Rage expenses: %.2f lv.", overall);
    }
}
