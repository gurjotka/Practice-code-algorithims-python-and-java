import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        process(new int[] {1,0,-1,0,-2,2}, 0);
        process(new int[] {2,2,2,2}, 8);

    }

    private static void process(int[] list, int target) {
        ArrayList<ArrayList<Integer>> group = new ArrayList<>();

        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list.length; j++) {
                for (int k=0; k<list.length; k++) {
                    for (int l=0; l<list.length; l++) {
                        if (list[i] + list[j] + list[k] + list[l] == target && i != j && j != k
                                && i != k && i != l && j != l && k != l) {
                            ArrayList<Integer> quadruple = new ArrayList<>();
                            quadruple.add(list[i]);
                            quadruple.add(list[j]);
                            quadruple.add(list[k]);
                            quadruple.add(list[l]);
                            Collections.sort(quadruple);
                            if (!group.contains(quadruple)) {
                                group.add(quadruple);
                            }
                        }

                    }
                }
            }
        }



        System.out.println(group);
    }
}
