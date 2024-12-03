import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sortColors(new int[] {2,0,2,1,1,0});
        sortColors(new int[] {0,1,2});
    }

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;

        while (ans <= right) {
            if (nums[ans] == 2) {
                int temp = nums[ans];
                nums[ans] = nums[right];
                nums[right] = temp;
                right -= 1;
            }
            else if (nums[ans] == 0) {
                int temp = nums[ans];
                nums[ans] = nums[left];
                nums[left] = temp;
                left += 1;
                ans += 1;
            }
            else {
                ans += 1;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}