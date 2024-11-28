public class lengthOfLastWord {
    public static void main(String[] args) {
        process("Hello World");
        process("Luffy is still joyboy");
        process("Luffy is gonna be the king of pirates");
    }

    private static void process(String text) {
        String lastWord = "";
        String[] words = text.split(" ");
        for (String word: words) {
            lastWord = words[words.length-1];
        }
        int lengthLastWord = lastWord.length();
        System.out.println("The last word is " + lastWord + "with length " + lengthLastWord + ".");
    }
}