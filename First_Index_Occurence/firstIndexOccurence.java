import java.util.ArrayList;
import java.util.List;

public class firstIndexOccurence{
    public static void main(String[] args) {
        process("sadbutsad", "sad");
        process("leetcode", "leeto");
        process("helloworld", "world");
    }
    private static void process(String haystack, String needle) {
        List<Integer> firstIndexWord = new ArrayList<>();
        int firstIndex = -1;
        if(haystack.contains(needle)) {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                // Check if the substring from index 'i' matches the needle
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    firstIndexWord.add(i);  // Add the index to the list
                    firstIndex = firstIndexWord.get(0);  // Get the first index
                    break;  // Stop after finding the first occurrence
                }
            }
            System.out.println("First index occurrence of the needle word = " + firstIndex);
        }
        else {
            System.out.println(-1);
        }

    }
}
