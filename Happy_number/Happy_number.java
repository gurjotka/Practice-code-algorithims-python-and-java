import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(process(19));
        System.out.println(process(2));
        System.out.println(process(1111111));
    }
    private static boolean process(int n) {
        List<Integer> seen = new ArrayList<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);

            n = sumOfSquares(n);
        }
        return true;

    }
    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;

        }
        return sum;
    }
}

