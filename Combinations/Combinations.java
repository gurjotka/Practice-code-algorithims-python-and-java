
import java.util.ArrayList;
import java.util.List;

public class Combinations {
    private static int n = 4;
    private static int k = 2;
    private static List<List<Integer>> output = new ArrayList<>();

    public static void main(String[] args) {
        backtrack(1, new ArrayList<>());
        System.out.println(output);
    }

    private static void backtrack(int first, List<Integer> curr) {
        if (curr.size() == k) {
            output.add(new ArrayList<>(curr));
            return;
        }
        for (int i = first; i <= n; i++) {
            curr.add(i);
            backtrack(i + 1, curr);
            curr.remove(curr.size() - 1); 
        }
    }
}
