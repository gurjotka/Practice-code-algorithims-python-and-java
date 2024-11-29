import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sum_3 {
    public static void main(String[] args) {
        process(new int[] {-1,0,1,2,-1,-4});
        process(new int[] {0,1,1});
        process(new int[] {0,0,0});

    }

    private static void process(int[] list) {
        ArrayList<ArrayList<Integer>> group = new ArrayList<>();

        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list.length; j++) {
                for (int k=0; k<list.length; k++) {
                    if (list[i] + list[j] + list[k] == 0 && i != j && j != k && i != k) {
                        ArrayList<Integer> triplet = new ArrayList<>();
                        triplet.add(list[i]);
                        triplet.add(list[j]);
                        triplet.add(list[k]);
                        Collections.sort(triplet);
                        if (!group.contains(triplet)) {
                            group.add(triplet);
                        }
                    }
                }
            }
        }



        System.out.println(group);
    }
}
