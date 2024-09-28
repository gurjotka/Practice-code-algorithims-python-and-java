
public class MultiplyStrings {
    public static void main(String[] args) {
        process("11","12");
        process("2", "3");
    }
    private static void process(String num1, String num2) {

        int len1 = num1.length();
        int len2 = num2.length();

        if (num1.equals("0") || num2.equals("0")){
            System.out.println("0");
        }

        int[] result = new int[len1 + len2];

        for(int i = len1-1; i >= 0; i-- ){
            for(int j = len2-1; j>=0; j--){
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum_carry = multiply + result[p2];

                result[p2] = sum_carry % 10;
                result[p1] = sum_carry / 10;

            }
        }
        StringBuilder result_str = new StringBuilder();
        for (int num : result){
            result_str.append(num);
        }
        String result_string = result_str.toString();
        result_string = result_string.replaceFirst("^0+(?!$)", "");

        System.out.println(result_string);
    }
}