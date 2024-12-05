import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        longestPalindrome("babadd");
        longestPalindrome("cbbd");
        longestPalindrome("121");
    }

    public static void longestPalindrome(String s) {
        List<String> palindromeList = new ArrayList<>();
        String Longest_Palindrome = "";

        for (int start=0; start < s.length(); start++) {
            for (int end = start + 1 ; end <= s.length(); end++) {
                String substring = s.substring(start, end);
                if (substring.equals(new StringBuilder(substring).reverse().toString())) {
                    palindromeList.add(substring);
                    if (substring.length() > Longest_Palindrome.length()) {
                        Longest_Palindrome = substring;
                    }
                }
            }
        }

        System.out.println(Longest_Palindrome);
    }
}