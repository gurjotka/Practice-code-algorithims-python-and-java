import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;

public class Uncommon_Words  {
    public static void main(String[] args) {
        process("this is sour","this is sweet");
        process("apple apple", "banana");
    }
    private static void process(String s1, String s2) {
        String[] word1 = s1.split(" ");

        String[] word2 = s2.split(" ");

        // Create a HashMap to count the occurrences of each word
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count words from the first string
        for (String word : word1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Count words from the second string
        for (String word : word2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Create a list to hold the unique words
        ArrayList<String> output = new ArrayList<>();

        // Find words that occur exactly once
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1) {
                output.add(word);
            }
        }
        System.out.println(output);
    }
}un