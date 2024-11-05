public class Single_number {
    public static void main(String[] args) {
        process(new int[] {2,2,1});
        process(new int[] {4,1,2,1,2});
        process(new int[] {1});
    }

    private static void process(int[] nums) {
        int single_number = 0;
        for (int num : nums) {
            single_number ^= num;
        }
        System.out.println(single_number);
    }
}
