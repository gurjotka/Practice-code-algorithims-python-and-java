import java.util.ArrayList;

public class Remaove_Element{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        int val = 3;
        nums.add(3);
        nums.add(3);
        nums.add(2);
        nums.add(2);

        System.out.println(nums);
        nums.removeIf(n -> n == val);
        System.out.println(nums);

    }
}