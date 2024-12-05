public class searchInsertPosition {
    public static void main(String[] args) {
        searchInsertPosition(new int[] {1, 3, 5, 6}, 5); // Expected output: 2
        searchInsertPosition(new int[] {1, 3, 5, 6}, 2); // Expected output: 1
        searchInsertPosition(new int[] {1, 3, 5, 6}, 7); // Expected output: 4
        searchInsertPosition(new int[] {1}, 2);          // Expected output: 1
    }

    public static void searchInsertPosition(int[] nums, int target) {
        int result = nums.length; // Default to insert at the end

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            } else if (nums[i] > target) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}