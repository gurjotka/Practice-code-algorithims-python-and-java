import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        majorityElement(new int[] {3,2,3});
        majorityElement(new int[] {2,2,1,1,1,2,2});
        majorityElement(new int[] {1,2,2,3,4,4,4,5});
    }

    public static void majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num:nums) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            }
            else{
                counts.put(num, 1);
            }
        }

        int max_count = 0;
        Integer max_count_element = null;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > max_count) {
                max_count = count;
                max_count_element = element;
            }
        }
        System.out.println(max_count_element);
    }
}