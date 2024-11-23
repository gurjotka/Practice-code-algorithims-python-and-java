public class Main {
    public static void main(String[] args) {
        process(0);
        process(4);
        process(8);
        process(656156545);
    }

    private static void process(int num) {
        int i = 0;
        while (i*i <= num) {
            i += 1;
        }
        System.out.println(i-1);
    }
}