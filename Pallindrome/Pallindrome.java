import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        process(121);
        process(123);
    }
    private static void process(int x) {

        // Conversing number x to a String List
        String numString = String.valueOf(x);

        List<String> list_num = new ArrayList<>();

        for(char digit : numString.toCharArray() ){
            list_num.add(String.valueOf(digit));
        }

        // Reversing the list
        List<String> Reversed_List = new ArrayList<>(list_num);
        Collections.reverse(Reversed_List);

        System.out.println(x + " is Pallindrome... " + Reversed_List.equals(list_num));
    }
}