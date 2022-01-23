package Labs.BasicSyntaxLab;

/*
Write a program, which prints the language, that a given country speaks. You can receive only the following
combinations: English is spoken in England and USA; Spanish is spoken in Spain, Argentina and Mexico; for the
others, we should print &quot;unknown&quot;.
 */

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String country = scan.nextLine();
        String lang;

        switch (country) {
            case "England":
            case "USA":
                lang = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                lang = "Spanish";
                break;
            default:
                lang = "unknown";
        }
        System.out.println(lang);
    }
}
