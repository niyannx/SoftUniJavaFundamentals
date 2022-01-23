package Labs.AssociativeArraysLab.WordSynonyms;

/*
Write a program which keeps a map with synonyms. The key of the map will be the word. The value will be a list of
all the synonyms of that word. You will be given a number n. On the next 2 * n lines you will be given a word and a
synonym each on a separate line like this:
 {word}
 {synonym}
If you get the same word for second time, just add the new synonym to the list.
Print the words in the following format:
{word} - {synonym1, synonym2… synonymN}
 */

import java.util.*;

public class WordSynonym {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        int nLines = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < nLines; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.printf("%s - ", entry.getKey());

            for (int i = 0; i < entry.getValue().size(); i++) {
                if (i == entry.getValue().size() - 1) {
                    System.out.printf("%s\n", entry.getValue().get(i));
                } else {
                    System.out.printf("%s, ", entry.getValue().get(i));
                }
            }
        }
    }
}
