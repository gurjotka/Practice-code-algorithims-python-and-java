import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> generatePermutations(List<String> word, List<String> current_perm) {
        List<String> result = new ArrayList<>();

        if (word.isEmpty()) {
            result.add(String.join("", current_perm));
            return result;
        }

        for (int i = 0; i < word.size(); i++) {
            String w = word.get(i);

            List<String> remaining = new ArrayList<>(word);
            remaining.remove(i);

            List<String> newPerm = new ArrayList<>(current_perm);
            newPerm.add(w);

            result.addAll(generatePermutations(remaining, newPerm));
        }

        return result;

    }

    public static List<Integer> findSubstring(String s, List<String> words) {
        List<Integer> output = new ArrayList<>();

        List<String> all_concatenations = generatePermutations(words, new ArrayList<>());

        for (String concatenation : all_concatenations) {
            int len = concatenation.length();

            for (int j = 0; j < s.length() - len; j++) {
                if (s.substring(j, j+len).equals(concatenation)) {
                    output.add(j);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(findSubstring("barfoothefoobarman", List.of("foo", "bar")));
        System.out.println(findSubstring("wordgoodgoodgoodbestword", List.of("word", "good", "best", "word")));
        System.out.println(findSubstring("barfoofoobarthefoobarman", List.of("bar", "foo", "the")));


    }

}