public class Main {
    public static void main(String[] args) {
        process("ab-cd");
        process("a-bC-dEf-ghIj");
        process("Test1ng-Leet=code-Q!");
    }
    private static void process(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        while (i < j) {
            if (Character.isLetter(charArray[i]) && Character.isLetter(charArray[j])) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            } else if (!Character.isLetter(charArray[j])) {
                j--;
            } else {
                i++;
            }
        }
        String result = new String(charArray);
        System.out.println(result);
    }
}


