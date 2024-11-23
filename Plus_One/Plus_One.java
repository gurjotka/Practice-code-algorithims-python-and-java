import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        process(new int[] {1,2,3});
        process(new int[] {4,3,2,1});
        process(new int[] {9,9});
    }
    private static void process(int[] digits) {
        StringBuilder numString = new StringBuilder();
        for (int digit : digits) {
            numString.append(digit);
        }
        long number = Long.parseLong(numString.toString());
        number += 1;

        String newNumberString = String.valueOf(number);

        int[] newDigits = newNumberString.chars().map(Character::getNumericValue).toArray();

        System.out.println(Arrays.toString(newDigits));
    }
}