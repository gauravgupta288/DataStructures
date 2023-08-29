package Month13_Aug.Day222_290823;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);li.add(2);li.add(3);

        List<List<Integer>> ans = new ArrayList<>();

        subset(ans, li);

        System.out.println();

    }

    static void subset(List<List<Integer>> list, List<Integer> nums){
        List<Integer> temp = nums;
        if(temp.size() == 0){
            return ;
        }

        for(int i = 0; i < nums.size(); i++){
            temp.remove(i);
            subset(list, temp);
            list.add(temp);
        }

        return;
    }
}
