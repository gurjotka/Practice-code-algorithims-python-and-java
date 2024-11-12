import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        process(new int[] {1, 2}, new int[] {-2, -1},
                new int[] {-1, 2}, new int[] {0, 2});
        process(new int[] {0}, new int[] {0},
                new int[] {0}, new int[] {0});

    }

    private static void process(int[] list1, int[] list2, int[] list3, int[] list4) {
        ArrayList<ArrayList<Integer>> group = new ArrayList<>();
        ArrayList<ArrayList<Integer>> index_tuple = new ArrayList<>();


        for (int i=0; i<list1.length; i++) {
            for (int j=0; j<list2.length; j++) {
                for (int k=0; k<list3.length; k++) {
                    for (int l=0; l<list4.length; l++) {
                        if (list1[i] + list2[j] + list3[k] + list4[l] == 0 ) {
                            ArrayList<Integer> result = new ArrayList<>();
                            ArrayList<Integer> result_tuple = new ArrayList<>();
                            result.add(list1[i]);
                            result.add(list2[j]);
                            result.add(list3[k]);
                            result.add(list4[l]);
                            result_tuple.add(i);
                            result_tuple.add(j);
                            result_tuple.add(k);
                            result_tuple.add(l);
                            Collections.sort(result);
                           
                            if (!group.contains(result)) {
                                group.add(result);
                            }
                            if (!index_tuple.contains(result_tuple)) {
                                index_tuple.add(result_tuple);
                            }
                        }

                    }
                }
            }
        }