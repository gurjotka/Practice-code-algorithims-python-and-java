import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        process(new int[] {1, 1, 2});
        process(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
    private static void process(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int i = 1;
        while (i < list.size()) {
            if (list.get(i).equals(list.get(i-1))) {
                list.remove(i);
            } else {
                i++;
            }
        }

        System.out.println(list.size());
        System.out.println(list);
        
    }
}


