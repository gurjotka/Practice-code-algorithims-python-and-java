import java.util.*;

public class Main {
    public static void main(String[] args) {
        firstAndLastOccurrence(new int[] {5,7,7,8,8,10}, 8);
        firstAndLastOccurrence(new int[] {5,7,7,8,8,10}, 6);
        firstAndLastOccurrence(new int[] {}, 0);
        System.out.println(Arrays.toString(firstLastOccurrenceLogO2(new int[]{5,7,7,8,8,10}, 8)));
        System.out.println(Arrays.toString(firstLastOccurrenceLogO2(new int[]{5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(firstLastOccurrenceLogO2(new int[]{}, 0)));
    }

    public static void firstAndLastOccurrence(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                output.add(i);
            }
        }
        if (output.isEmpty()) {
            output.add(-1);
            output.add(-1);
        }

        System.out.println(output);
    }

    public static int[] firstLastOccurrenceLogO2(int[] nums, int target) {
        int low = search(nums, target);
        int high = search(nums, target+1) -1;

        if (low <= high && low < nums.length && nums[low] == target) {
            return new int[]{low, high};
        }

        return new int[]{-1,-1};
    }

    private static int search(int[] nums, int x) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < x) {
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        return lo;
    }

}