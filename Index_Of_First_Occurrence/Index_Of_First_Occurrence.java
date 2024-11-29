import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        indexOfFirstOccurrence("sadbutsad", "sad");
        indexOfFirstOccurrence("leetcode", "leeto");
    }

    public static void indexOfFirstOccurrence(String haystack, String needle) {
        List<Integer> index = new ArrayList<>();

        if (!haystack.contains(needle)){
            index.add(-1);
        }
        else{
            for (int i = 0; i <= haystack.length()- needle.length(); i++){
                if (haystack.substring(i, i + needle.length()).equals(needle)){
                    index.add(i);
                }
            }
        }

        System.out.println(index.get(0));
    }
}