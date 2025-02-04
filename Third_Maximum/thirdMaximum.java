import java.util.*;

public class thirdMaximum{
    public static void main(String[] args) {
        process(new int[] {3,2,1});
        process(new int[] {1,2});
        process(new int[] {2,2,3,1});
    }

    public static void process(int[] nums) {
        TreeSet<Integer> sortedSet = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            sortedSet.add(num);
        }

        List<Integer> sortedNums = new ArrayList<>(sortedSet);

        if(sortedNums.size() >= 3) {
            System.out.println(sortedNums.get(2));
        } else {
            System.out.println(sortedNums.get(0));
        }
    }
}
