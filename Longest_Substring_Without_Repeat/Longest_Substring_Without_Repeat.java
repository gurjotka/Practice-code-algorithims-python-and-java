
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Longest_Substring_Without_Repeat{
    public static void main(String[] args){
        String s = "abcabcbb";
        List<Character> output_needed = new ArrayList<>();
        int max_length = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            while (output_needed.contains(s.charAt(i))) {
                output_needed.remove((Character) s.charAt(start));
                start++;
            }

            output_needed.add(s.charAt(i));

            if (output_needed.size() > max_length) {
                max_length = output_needed.size();
            }
        }
        System.out.println(max_length);

    }
}
