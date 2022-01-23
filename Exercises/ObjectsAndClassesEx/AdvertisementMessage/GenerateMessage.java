package Exercises.ObjectsAndClassesEx.AdvertisementMessage;

/*
Write a program that generates random fake advertisement message to extol some product. The messages must
consist of 4 parts: laudatory phrase + event + author + city. Use the following predefined parts:
 Phrases – {&quot;Excellent product.&quot;, &quot;Such a great product.&quot;, &quot;I always use that product.&quot;,
&quot;Best product of its category.&quot;, &quot;Exceptional product.&quot;, &quot;I can’t live without this
product.&quot;}
 Events – {&quot;Now I feel good.&quot;, &quot;I have succeeded with this product.&quot;, &quot;Makes miracles.
I am happy of the results!&quot;, &quot;I cannot believe but now I feel awesome.&quot;, &quot;Try it
yourself, I am very satisfied.&quot;, &quot;I feel great!&quot;}
 Authors – {&quot;Diana&quot;, &quot;Petya&quot;, &quot;Stella&quot;, &quot;Elena&quot;, &quot;Katya&quot;, &quot;Iva&quot;, &quot;Annie&quot;, &quot;Eva&quot;}
 Cities – {&quot;Burgas&quot;, &quot;Sofia&quot;, &quot;Plovdiv&quot;, &quot;Varna&quot;, &quot;Ruse&quot;}
The format of the output message is: {phrase} {event} {author} – {city}.
As an input, you take the number of messages to be generated. Print each random message on a separate line.
 */

import java.util.Random;

public class GenerateMessage {

    Random random = new Random();

    private final String[] phrases = {"Excellent product.",
            "Such a great product.",
            "I always use that product.",
            "Best product of its category.",
            "Exceptional product.",
            "I can’t live without this product."};

    private final String[] events = {"Now I feel good.",
            "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.",
            "I feel great!"};

    private final String[] authors = {"Diana",
            "Petya",
            "Stella",
            "Elena",
            "Katya",
            "Iva",
            "Annie",
            "Eva"};

    private final String[] cities = {"Burgas",
            "Sofia",
            "Plovdiv",
            "Varna",
            "Ruse"};


    public void PrintMessage() {
        System.out.printf("%s %s %s - %s\n", phrases[random.nextInt(phrases.length)],
                events[random.nextInt(events.length)],
                authors[random.nextInt(authors.length)],
                cities[random.nextInt(cities.length)]);
    }
}
