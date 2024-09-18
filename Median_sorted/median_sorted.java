
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Integer> list1 = List.of(7,8,9,10,11,12);
        List<Integer> list2 = List.of(4,11,8,7);
        float median = 0f;

        List<Integer> list = new ArrayList<>();

        list.addAll(list1);
        list.addAll(list2);

        Collections.sort(list);

        System.out.println(list);
        int len_list = list.size();
        System.out.println("Length of the list = " );
        if(len_list % 2 == 0){
            median = (list.get(len_list/2) + list.get((len_list/2) - 1))/2.0f;
        }
        else{
            median = list.get((len_list-1)/2);
        }

        System.out.println("Median = " + median);
    }
}
