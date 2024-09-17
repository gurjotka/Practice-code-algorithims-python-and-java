
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Integer> list = List.of(7,8,9,10,11,12);
        int target = 1;
        List<Integer> positive_num = new ArrayList<>();

        for(int num:list) {
            if (num > 0) {
                positive_num.add(num);
            }
        }
        int min_pos_num = Collections.min(positive_num);
        // System.out.println(min_pos_num);

        if (min_pos_num == target){
            target = min_pos_num + 1;
            if (list.contains(target)){
                target += 1;
            }
        }
        System.out.println("Missing First Positive Number =  " + target );
    }
}

